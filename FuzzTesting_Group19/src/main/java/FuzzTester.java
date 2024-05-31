import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FuzzTester extends JFrame {
    private JTextField numTestsField;
    private JTextArea resultArea;
    private JTextArea customInputArea;
    private JButton startButton;
    private JButton clearButton;
    private JButton generateRandomDataButton;
    private static final String INPUT_FILE = "fuzz_input.txt";
    private static final String RANDOM_DATA_FILE = "random_data.txt";
    private static final String KWIC_PROGRAM = "java -cp . KWIC";
    private static final int NUM_TEST_CASES = 8;

    public FuzzTester() {
        setTitle("Fuzz Testing Tool");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));

        // Top Panel for inputs
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel instructionsLabel = new JLabel("<html>Enter test case number (1-" + NUM_TEST_CASES + ") or 0 for all:<br/>" +
                "1. No input<br/>" +
                "2. Words only<br/>" +
                "3. Numbers only<br/>" +
                "4. Special characters only<br/>" +
                "5. Letters and numbers<br/>" +
                "6. Numbers and special characters<br/>" +
                "7. Letters and special characters<br/>" +
                "8. Letters, numbers, and special characters<br/>" +
                "9. Custom input<br/></html>");
        instructionsLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel numTestsLabel = new JLabel("Test Case Number: ");
        numTestsField = new JTextField(10);
        startButton = new JButton("Start Testing");
        clearButton = new JButton("Clear");
        generateRandomDataButton = new JButton("Generate Random Data");

        inputPanel.add(numTestsLabel);
        inputPanel.add(numTestsField);
        inputPanel.add(startButton);
        inputPanel.add(clearButton);
        inputPanel.add(generateRandomDataButton);

        customInputArea = new JTextArea(5, 40);
        customInputArea.setBorder(BorderFactory.createTitledBorder("Custom Input (for test case 9)"));

        topPanel.add(instructionsLabel);
        topPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        topPanel.add(inputPanel);
        topPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        topPanel.add(customInputArea);

        // Center Panel for results
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        // Button actions
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startFuzzTesting();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.setText("");
                customInputArea.setText("");
                numTestsField.setText("");
            }
        });

        generateRandomDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomData();
            }
        });
    }

    private void startFuzzTesting() {
        int testCaseNumber;
        try {
            testCaseNumber = Integer.parseInt(numTestsField.getText());
            if (testCaseNumber < 0 || testCaseNumber > NUM_TEST_CASES + 1) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid test case number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        new Thread(() -> performFuzzTesting(testCaseNumber)).start();
    }

    private void performFuzzTesting(int testCaseNumber) {
        Set<String> uniqueCrashes = new HashSet<>();

        List<Integer> testCasesToRun = new ArrayList<>();
        if (testCaseNumber == 0) {
            for (int i = 1; i <= NUM_TEST_CASES; i++) {
                testCasesToRun.add(i);
            }
        } else {
            testCasesToRun.add(testCaseNumber);
        }

        for (int testCase : testCasesToRun) {
            List<String> titles;
            if (testCase == NUM_TEST_CASES + 1) {
                titles = Arrays.asList(customInputArea.getText().split("\n"));
            } else {
                titles = generateTestCaseTitles(testCase);
            }
            try {
                writeInputFile(titles);

                // Split the command properly for ProcessBuilder
                String[] command = KWIC_PROGRAM.split(" ");
                List<String> commandList = new ArrayList<>(Arrays.asList(command));
                commandList.add(INPUT_FILE);

                ProcessBuilder builder = new ProcessBuilder(commandList);
                builder.redirectErrorStream(true);
                Process process = builder.start();

                boolean finished = process.waitFor(5, TimeUnit.SECONDS);
                if (!finished) {
                    process.destroyForcibly();
                    continue;
                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                StringBuilder output = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }

                int exitCode = process.waitFor();
                if (exitCode != 0) {
                    String crashLog = output.toString();
                    if (uniqueCrashes.add(crashLog)) {
                        updateResultArea("----------------------------\n" +
                                "Unique crash found:\n" + "----------------------------\n"
                                + crashLog + "\nCaused by input:\n"
                                + String.join("\n", titles) + "\n");
                    }
                } else {
                    updateResultArea("Test case " + testCase + " passed successfully with input:\n" + String.join("\n", titles) + "\n");
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        updateResultArea("Fuzz testing completed.");
    }

    private void generateRandomData() {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RANDOM_DATA_FILE))) {
            for (int i = 0; i < 1000; i++) { // Adjust the number of titles as needed
                int titleLength = random.nextInt(50) + 1;
                StringBuilder title = new StringBuilder();
                for (int j = 0; j < titleLength; j++) {
                    char randomChar = (char) (random.nextInt(95) + 32); // ASCII 32-126
                    title.append(randomChar);
                }
                writer.write(title.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Random data generated and saved to file: " + RANDOM_DATA_FILE, "Random Data Generated", JOptionPane.INFORMATION_MESSAGE);
    }


    private void updateResultArea(String message) {
        SwingUtilities.invokeLater(() -> resultArea.append(message + "\n"));
    }

    private List<String> generateTestCaseTitles(int testCase) {
        List<String> titles = new ArrayList<>();
        Random random = new Random();
        int numberOfTitles = random.nextInt(10) + 1;

        if (testCase == 1) {
            // Return empty list for no input
            return titles;
        }

        for (int i = 0; i < numberOfTitles; i++) {
            int titleLength = random.nextInt(50) + 1;
            StringBuilder title = new StringBuilder();
            switch (testCase) {
                case 2: // Only contains words
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        title.append(randomChar);
                    }
                    break;
                case 3: // Only contains numbers
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        title.append(randomChar);
                    }
                    break;
                case 4: // Only contains special characters
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        title.append(randomChar);
                    }
                    break;
                case 5: // Contains letters and numbers
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar;
                        if (random.nextBoolean()) {
                            randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        } else {
                            randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        }
                        title.append(randomChar);
                    }
                    break;
                case 6: // Contains numbers and special characters
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar;
                        if (random.nextBoolean()) {
                            randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        } else {
                            randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        }
                        title.append(randomChar);
                    }
                    break;
                case 7: // Contains letters and special characters
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar;
                        if (random.nextBoolean()) {
                            randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        } else {
                            randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        }
                        title.append(randomChar);
                    }
                    break;
                case 8: // Contains letters, numbers, and special characters
                    for (int j = 0; j < titleLength; j++) {
                        char randomChar;
                        if (random.nextBoolean()) {
                            randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        } else if (random.nextBoolean()) {
                            randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        } else {
                            randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        }
                        title.append(randomChar);
                    }
                    break;
            }
            titles.add(title.toString());
        }
        return titles;
    }

    private void writeInputFile(List<String> titles) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE));
        for (String title : titles) {
            writer.write(title);
            writer.newLine();
        }
        writer.close();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FuzzTester tester = new FuzzTester();
            tester.setVisible(true);
        });
    }
}
