/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

@java.lang.SuppressWarnings({"fallthrough"}) public class FuzzTester extends JFrame {static class __CLR4_4_1mmlwzoeioq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u004d\u0061\u006e\u0075\u006c\u0061\u005c\u005c\u0041\u0063\u0061\u0064\u0065\u006d\u0069\u0063\u0073\u005c\u005c\u004d\u0061\u0073\u0074\u0065\u0072\u0020\u0069\u006e\u0020\u0043\u0079\u0062\u0065\u0072\u0020\u0053\u0065\u0063\u0075\u0072\u0069\u0074\u0079\u005c\u005c\u0053\u0065\u006d\u0020\u0033\u005c\u005c\u0053\u0045\u004e\u0047\u0036\u0033\u0032\u0030\u0020\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0020\u0056\u0065\u0072\u0069\u0066\u0069\u0063\u0061\u0074\u0069\u006f\u006e\u0020\u0061\u006e\u0064\u0020\u0056\u0061\u006c\u0069\u0064\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0041\u0073\u0073\u0069\u0067\u006e\u006d\u0065\u006e\u0074\u0020\u0032\u005c\u005c\u0043\u006f\u0064\u0065\u0062\u0061\u0073\u0065\u005c\u005c\u0046\u0075\u007a\u007a\u005f\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u005f\u004b\u0057\u0049\u0043\u005f\u0050\u0072\u006f\u0067\u0072\u0061\u006d\u005c\u005c\u0046\u0075\u007a\u007a\u0054\u0065\u0073\u0074\u0069\u006e\u0067\u005f\u0047\u0072\u006f\u0075\u0070\u0031\u0039\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1717461784960L,8589935092L,303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JTextField numTestsField;
    private JTextArea resultArea;
    private JTextArea customInputArea;
    private JButton startButton;
    private JButton clearButton;
    private JButton generateRandomDataButton;
    private JButton testWithRandomDataButton;
    private static final String INPUT_FILE = "fuzz_input.txt";
    private static final String RANDOM_DATA_FILE = "random_data.txt";
    private static final String KWIC_PROGRAM = "java -cp . KWIC";
    private static final int NUM_TEST_CASES = 9;

    public FuzzTester() {try{__CLR4_4_1mmlwzoeioq.R.inc(22);
        __CLR4_4_1mmlwzoeioq.R.inc(23);setTitle("Fuzz Testing Tool");
        __CLR4_4_1mmlwzoeioq.R.inc(24);setSize(800, 600);
        __CLR4_4_1mmlwzoeioq.R.inc(25);setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        __CLR4_4_1mmlwzoeioq.R.inc(26);initComponents();
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void initComponents() {try{__CLR4_4_1mmlwzoeioq.R.inc(27);
        __CLR4_4_1mmlwzoeioq.R.inc(28);JPanel panel = new JPanel();
        __CLR4_4_1mmlwzoeioq.R.inc(29);panel.setLayout(new BorderLayout(10, 10));

        // Top Panel for inputs
        __CLR4_4_1mmlwzoeioq.R.inc(30);JPanel topPanel = new JPanel();
        __CLR4_4_1mmlwzoeioq.R.inc(31);topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        __CLR4_4_1mmlwzoeioq.R.inc(32);topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        __CLR4_4_1mmlwzoeioq.R.inc(33);JLabel instructionsLabel = new JLabel("<html>Enter test case number (1-" + NUM_TEST_CASES + ") or 0 for all:<br/>" +
                "1. No input<br/>" +
                "2. Words only<br/>" +
                "3. Numbers only<br/>" +
                "4. Special characters only<br/>" +
                "5. Letters and numbers<br/>" +
                "6. Numbers and special characters<br/>" +
                "7. Letters and special characters<br/>" +
                "8. Letters, numbers, and special characters<br/>" +
                "9. Custom input<br/>" +
                "10. Use Random Data File<br/></html>");
        __CLR4_4_1mmlwzoeioq.R.inc(34);instructionsLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        __CLR4_4_1mmlwzoeioq.R.inc(35);JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        __CLR4_4_1mmlwzoeioq.R.inc(36);JLabel numTestsLabel = new JLabel("Test Case Number: ");
        __CLR4_4_1mmlwzoeioq.R.inc(37);numTestsField = new JTextField(10);
        __CLR4_4_1mmlwzoeioq.R.inc(38);startButton = new JButton("Start Testing");
        __CLR4_4_1mmlwzoeioq.R.inc(39);clearButton = new JButton("Clear");
        __CLR4_4_1mmlwzoeioq.R.inc(40);generateRandomDataButton = new JButton("Generate Random Data");
        __CLR4_4_1mmlwzoeioq.R.inc(41);testWithRandomDataButton = new JButton("Test with Random Data");

        __CLR4_4_1mmlwzoeioq.R.inc(42);inputPanel.add(numTestsLabel);
        __CLR4_4_1mmlwzoeioq.R.inc(43);inputPanel.add(numTestsField);
        __CLR4_4_1mmlwzoeioq.R.inc(44);inputPanel.add(startButton);
        __CLR4_4_1mmlwzoeioq.R.inc(45);inputPanel.add(clearButton);
        __CLR4_4_1mmlwzoeioq.R.inc(46);inputPanel.add(generateRandomDataButton);
        __CLR4_4_1mmlwzoeioq.R.inc(47);inputPanel.add(testWithRandomDataButton);

        __CLR4_4_1mmlwzoeioq.R.inc(48);customInputArea = new JTextArea(5, 40);
        __CLR4_4_1mmlwzoeioq.R.inc(49);customInputArea.setBorder(BorderFactory.createTitledBorder("Custom Input (for test case 9)"));

        __CLR4_4_1mmlwzoeioq.R.inc(50);topPanel.add(instructionsLabel);
        __CLR4_4_1mmlwzoeioq.R.inc(51);topPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        __CLR4_4_1mmlwzoeioq.R.inc(52);topPanel.add(inputPanel);
        __CLR4_4_1mmlwzoeioq.R.inc(53);topPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        __CLR4_4_1mmlwzoeioq.R.inc(54);topPanel.add(customInputArea);

        // Center Panel for results
        __CLR4_4_1mmlwzoeioq.R.inc(55);resultArea = new JTextArea();
        __CLR4_4_1mmlwzoeioq.R.inc(56);resultArea.setEditable(false);
        __CLR4_4_1mmlwzoeioq.R.inc(57);resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        __CLR4_4_1mmlwzoeioq.R.inc(58);JScrollPane scrollPane = new JScrollPane(resultArea);

        __CLR4_4_1mmlwzoeioq.R.inc(59);panel.add(topPanel, BorderLayout.NORTH);
        __CLR4_4_1mmlwzoeioq.R.inc(60);panel.add(scrollPane, BorderLayout.CENTER);

        __CLR4_4_1mmlwzoeioq.R.inc(61);add(panel);

        // Button actions
        __CLR4_4_1mmlwzoeioq.R.inc(62);startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_4_1mmlwzoeioq.R.inc(63);
                __CLR4_4_1mmlwzoeioq.R.inc(64);startFuzzTesting();
            }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}
        });

        __CLR4_4_1mmlwzoeioq.R.inc(65);clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_4_1mmlwzoeioq.R.inc(66);
                __CLR4_4_1mmlwzoeioq.R.inc(67);resultArea.setText("");
                __CLR4_4_1mmlwzoeioq.R.inc(68);customInputArea.setText("");
                __CLR4_4_1mmlwzoeioq.R.inc(69);numTestsField.setText("");
            }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}
        });

        __CLR4_4_1mmlwzoeioq.R.inc(70);generateRandomDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_4_1mmlwzoeioq.R.inc(71);
                __CLR4_4_1mmlwzoeioq.R.inc(72);generateRandomData();
            }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}
        });

        __CLR4_4_1mmlwzoeioq.R.inc(73);testWithRandomDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {try{__CLR4_4_1mmlwzoeioq.R.inc(74);
                __CLR4_4_1mmlwzoeioq.R.inc(75);performFuzzTestingWithRandomData();
            }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}
        });
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void startFuzzTesting() {try{__CLR4_4_1mmlwzoeioq.R.inc(76);
        __CLR4_4_1mmlwzoeioq.R.inc(77);int testCaseNumber;
        __CLR4_4_1mmlwzoeioq.R.inc(78);try {
            __CLR4_4_1mmlwzoeioq.R.inc(79);testCaseNumber = Integer.parseInt(numTestsField.getText());
            __CLR4_4_1mmlwzoeioq.R.inc(80);if ((((testCaseNumber < 0 || testCaseNumber > NUM_TEST_CASES + 1)&&(__CLR4_4_1mmlwzoeioq.R.iget(81)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(82)==0&false))) {{
                __CLR4_4_1mmlwzoeioq.R.inc(83);throw new NumberFormatException();
            }
        }} catch (NumberFormatException e) {
            __CLR4_4_1mmlwzoeioq.R.inc(84);JOptionPane.showMessageDialog(this, "Please enter a valid test case number.", "Error", JOptionPane.ERROR_MESSAGE);
            __CLR4_4_1mmlwzoeioq.R.inc(85);return;
        }

        __CLR4_4_1mmlwzoeioq.R.inc(86);new Thread(() -> performFuzzTesting(testCaseNumber)).start();
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void performFuzzTesting(int testCaseNumber) {try{__CLR4_4_1mmlwzoeioq.R.inc(87);
        __CLR4_4_1mmlwzoeioq.R.inc(88);Set<String> uniqueCrashes = new HashSet<>();

        __CLR4_4_1mmlwzoeioq.R.inc(89);List<Integer> testCasesToRun = new ArrayList<>();
        __CLR4_4_1mmlwzoeioq.R.inc(90);if ((((testCaseNumber == 0)&&(__CLR4_4_1mmlwzoeioq.R.iget(91)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(92)==0&false))) {{
            __CLR4_4_1mmlwzoeioq.R.inc(93);for (int i = 1; (((i <= NUM_TEST_CASES)&&(__CLR4_4_1mmlwzoeioq.R.iget(94)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(95)==0&false)); i++) {{
                __CLR4_4_1mmlwzoeioq.R.inc(96);testCasesToRun.add(i);
            }
        }} }else {{
            __CLR4_4_1mmlwzoeioq.R.inc(97);testCasesToRun.add(testCaseNumber);
        }

        }__CLR4_4_1mmlwzoeioq.R.inc(98);for (int testCase : testCasesToRun) {{
            __CLR4_4_1mmlwzoeioq.R.inc(99);List<String> titles;
            __CLR4_4_1mmlwzoeioq.R.inc(100);if ((((testCase == NUM_TEST_CASES + 1)&&(__CLR4_4_1mmlwzoeioq.R.iget(101)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(102)==0&false))) {{
                __CLR4_4_1mmlwzoeioq.R.inc(103);titles = Arrays.asList(customInputArea.getText().split("\n"));
            } }else {{
                __CLR4_4_1mmlwzoeioq.R.inc(104);titles = generateTestCaseTitles(testCase);
            }
            }__CLR4_4_1mmlwzoeioq.R.inc(105);try {
                __CLR4_4_1mmlwzoeioq.R.inc(106);writeInputFile(titles);

                // Split the command properly for ProcessBuilder
                __CLR4_4_1mmlwzoeioq.R.inc(107);String[] command = KWIC_PROGRAM.split(" ");
                __CLR4_4_1mmlwzoeioq.R.inc(108);List<String> commandList = new ArrayList<>(Arrays.asList(command));
                __CLR4_4_1mmlwzoeioq.R.inc(109);commandList.add(INPUT_FILE);

                __CLR4_4_1mmlwzoeioq.R.inc(110);ProcessBuilder builder = new ProcessBuilder(commandList);
                __CLR4_4_1mmlwzoeioq.R.inc(111);builder.redirectErrorStream(true);
                __CLR4_4_1mmlwzoeioq.R.inc(112);Process process = builder.start();

                __CLR4_4_1mmlwzoeioq.R.inc(113);boolean finished = process.waitFor(5, TimeUnit.SECONDS);
                __CLR4_4_1mmlwzoeioq.R.inc(114);if ((((!finished)&&(__CLR4_4_1mmlwzoeioq.R.iget(115)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(116)==0&false))) {{
                    __CLR4_4_1mmlwzoeioq.R.inc(117);process.destroyForcibly();
                    __CLR4_4_1mmlwzoeioq.R.inc(118);continue;
                }

                }__CLR4_4_1mmlwzoeioq.R.inc(119);BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                __CLR4_4_1mmlwzoeioq.R.inc(120);StringBuilder output = new StringBuilder();
                __CLR4_4_1mmlwzoeioq.R.inc(121);String line;
                __CLR4_4_1mmlwzoeioq.R.inc(122);while ((line = reader.readLine()) != null) {{
                    __CLR4_4_1mmlwzoeioq.R.inc(125);output.append(line).append("\n");
                }

                }__CLR4_4_1mmlwzoeioq.R.inc(126);int exitCode = process.waitFor();
                __CLR4_4_1mmlwzoeioq.R.inc(127);if ((((exitCode != 0)&&(__CLR4_4_1mmlwzoeioq.R.iget(128)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(129)==0&false))) {{
                    __CLR4_4_1mmlwzoeioq.R.inc(130);String crashLog = output.toString();
                    __CLR4_4_1mmlwzoeioq.R.inc(131);if ((((uniqueCrashes.add(crashLog))&&(__CLR4_4_1mmlwzoeioq.R.iget(132)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(133)==0&false))) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(134);updateResultArea("----------------------------\n" +
                                "Unique crash found at " + testCase +"\n" + "----------------------------\n"
                                + crashLog + "\nCaused by input:\n"
                                + String.join("\n", titles) + "\n");
                    }
                }} }else {{
                    __CLR4_4_1mmlwzoeioq.R.inc(135);updateResultArea("Test case " + testCase + " passed successfully with input:\n" + String.join("\n", titles) + "\n");
                }
            }} catch (IOException | InterruptedException e) {
                __CLR4_4_1mmlwzoeioq.R.inc(136);e.printStackTrace();
            }
        }

        }__CLR4_4_1mmlwzoeioq.R.inc(137);updateResultArea("Fuzz testing completed. Number of unique crashes: " + uniqueCrashes.size() + "\n");
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void generateRandomData() {try{__CLR4_4_1mmlwzoeioq.R.inc(138);
        __CLR4_4_1mmlwzoeioq.R.inc(139);int numTitles = 50;
        __CLR4_4_1mmlwzoeioq.R.inc(140);String input = JOptionPane.showInputDialog(this, "Enter number of book titles to generate:", "50");
        __CLR4_4_1mmlwzoeioq.R.inc(141);try {
            __CLR4_4_1mmlwzoeioq.R.inc(142);numTitles = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            __CLR4_4_1mmlwzoeioq.R.inc(143);JOptionPane.showMessageDialog(this, "Invalid number. Generating 50 titles by default.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        __CLR4_4_1mmlwzoeioq.R.inc(144);Random random = new Random();
        class __CLR4_4_1$AC0 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1mmlwzoeioq.R.inc(145);try (__CLR4_4_1$AC0 __CLR$ACI0=new __CLR4_4_1$AC0(){{__CLR4_4_1mmlwzoeioq.R.inc(146);}};BufferedWriter writer = new BufferedWriter(new FileWriter(RANDOM_DATA_FILE))) {
            __CLR4_4_1mmlwzoeioq.R.inc(147);for (int i = 0; (((i < numTitles)&&(__CLR4_4_1mmlwzoeioq.R.iget(148)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(149)==0&false)); i++) {{
                __CLR4_4_1mmlwzoeioq.R.inc(150);int titleLength = random.nextInt(50) + 1;
                __CLR4_4_1mmlwzoeioq.R.inc(151);StringBuilder title = new StringBuilder();
                __CLR4_4_1mmlwzoeioq.R.inc(152);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(153)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(154)==0&false)); j++) {{
                    __CLR4_4_1mmlwzoeioq.R.inc(155);char randomChar = (char) (random.nextInt(95) + 32);
                    __CLR4_4_1mmlwzoeioq.R.inc(156);title.append(randomChar);
                }
                }__CLR4_4_1mmlwzoeioq.R.inc(157);writer.write(title.toString());
                __CLR4_4_1mmlwzoeioq.R.inc(158);writer.newLine();
            }
        }} catch (IOException e) {
            __CLR4_4_1mmlwzoeioq.R.inc(159);e.printStackTrace();
        }
        __CLR4_4_1mmlwzoeioq.R.inc(160);JOptionPane.showMessageDialog(this, "Random data generated and saved to file: " + RANDOM_DATA_FILE, "Random Data Generated", JOptionPane.INFORMATION_MESSAGE);
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void performFuzzTestingWithRandomData() {try{__CLR4_4_1mmlwzoeioq.R.inc(161);
        __CLR4_4_1mmlwzoeioq.R.inc(162);List<String> titles = new ArrayList<>();
        class __CLR4_4_1$AC1 implements java.lang.AutoCloseable {public void close(){}}; __CLR4_4_1mmlwzoeioq.R.inc(163);try (__CLR4_4_1$AC1 __CLR$ACI1=new __CLR4_4_1$AC1(){{__CLR4_4_1mmlwzoeioq.R.inc(164);}};BufferedReader reader = new BufferedReader(new FileReader(RANDOM_DATA_FILE))) {
            __CLR4_4_1mmlwzoeioq.R.inc(165);String randomDataLine;
            __CLR4_4_1mmlwzoeioq.R.inc(166);while ((randomDataLine = reader.readLine()) != null) {{
                __CLR4_4_1mmlwzoeioq.R.inc(169);titles.add(randomDataLine);
            }
            }__CLR4_4_1mmlwzoeioq.R.inc(170);writeInputFile(titles);

            // Split the command properly for ProcessBuilder
            __CLR4_4_1mmlwzoeioq.R.inc(171);String[] command = KWIC_PROGRAM.split(" ");
            __CLR4_4_1mmlwzoeioq.R.inc(172);List<String> commandList = new ArrayList<>(Arrays.asList(command));
            __CLR4_4_1mmlwzoeioq.R.inc(173);commandList.add(INPUT_FILE);

            __CLR4_4_1mmlwzoeioq.R.inc(174);ProcessBuilder builder = new ProcessBuilder(commandList);
            __CLR4_4_1mmlwzoeioq.R.inc(175);builder.redirectErrorStream(true);
            __CLR4_4_1mmlwzoeioq.R.inc(176);Process process = builder.start();

            __CLR4_4_1mmlwzoeioq.R.inc(177);boolean finished = process.waitFor(5, TimeUnit.SECONDS);
            __CLR4_4_1mmlwzoeioq.R.inc(178);if ((((!finished)&&(__CLR4_4_1mmlwzoeioq.R.iget(179)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(180)==0&false))) {{
                __CLR4_4_1mmlwzoeioq.R.inc(181);process.destroyForcibly();
                __CLR4_4_1mmlwzoeioq.R.inc(182);return;
            }

            }__CLR4_4_1mmlwzoeioq.R.inc(183);BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            __CLR4_4_1mmlwzoeioq.R.inc(184);StringBuilder output = new StringBuilder();
            __CLR4_4_1mmlwzoeioq.R.inc(185);String outputLine;
            __CLR4_4_1mmlwzoeioq.R.inc(186);while ((outputLine = outputReader.readLine()) != null) {{
                __CLR4_4_1mmlwzoeioq.R.inc(189);output.append(outputLine).append("\n");
            }

            }__CLR4_4_1mmlwzoeioq.R.inc(190);int exitCode = process.waitFor();
            __CLR4_4_1mmlwzoeioq.R.inc(191);if ((((exitCode != 0)&&(__CLR4_4_1mmlwzoeioq.R.iget(192)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(193)==0&false))) {{
                __CLR4_4_1mmlwzoeioq.R.inc(194);updateResultArea("----------------------------\n" +
                        "Crash found when testing with random data file:\n" +
                        "----------------------------\n" + output.toString());
            } }else {{
                __CLR4_4_1mmlwzoeioq.R.inc(195);updateResultArea("Testing with random data file passed successfully.\n");
            }
        }} catch (IOException | InterruptedException e) {
            __CLR4_4_1mmlwzoeioq.R.inc(196);e.printStackTrace();
        }
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void updateResultArea(String message) {try{__CLR4_4_1mmlwzoeioq.R.inc(197);
        __CLR4_4_1mmlwzoeioq.R.inc(198);SwingUtilities.invokeLater(() -> resultArea.append(message + "\n"));
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private List<String> generateTestCaseTitles(int testCase) {try{__CLR4_4_1mmlwzoeioq.R.inc(199);
        __CLR4_4_1mmlwzoeioq.R.inc(200);List<String> titles = new ArrayList<>();
        __CLR4_4_1mmlwzoeioq.R.inc(201);Random random = new Random();
        __CLR4_4_1mmlwzoeioq.R.inc(202);int numberOfTitles = random.nextInt(10) + 1;

        __CLR4_4_1mmlwzoeioq.R.inc(203);if ((((testCase == 1)&&(__CLR4_4_1mmlwzoeioq.R.iget(204)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(205)==0&false))) {{
            // Return empty list for no input
            __CLR4_4_1mmlwzoeioq.R.inc(206);return titles;
        }

        }__CLR4_4_1mmlwzoeioq.R.inc(207);for (int i = 0; (((i < numberOfTitles)&&(__CLR4_4_1mmlwzoeioq.R.iget(208)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(209)==0&false)); i++) {{
            __CLR4_4_1mmlwzoeioq.R.inc(210);int titleLength = random.nextInt(50) + 1;
            __CLR4_4_1mmlwzoeioq.R.inc(211);StringBuilder title = new StringBuilder();
            boolean __CLB4_4_1_bool0=false;__CLR4_4_1mmlwzoeioq.R.inc(212);switch (testCase) {
                case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(213);__CLB4_4_1_bool0=true;} // Only contains words
                    __CLR4_4_1mmlwzoeioq.R.inc(214);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(215)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(216)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(217);char randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        __CLR4_4_1mmlwzoeioq.R.inc(218);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(219);break;
                case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(220);__CLB4_4_1_bool0=true;} // Only contains numbers
                    __CLR4_4_1mmlwzoeioq.R.inc(221);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(222)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(223)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(224);char randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        __CLR4_4_1mmlwzoeioq.R.inc(225);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(226);break;
                case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(227);__CLB4_4_1_bool0=true;} // Only contains special characters
                    __CLR4_4_1mmlwzoeioq.R.inc(228);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(229)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(230)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(231);char randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        __CLR4_4_1mmlwzoeioq.R.inc(232);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(233);break;
                case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(234);__CLB4_4_1_bool0=true;} // Contains letters and numbers
                    __CLR4_4_1mmlwzoeioq.R.inc(235);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(236)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(237)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(238);char randomChar;
                        __CLR4_4_1mmlwzoeioq.R.inc(239);if ((((random.nextBoolean())&&(__CLR4_4_1mmlwzoeioq.R.iget(240)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(241)==0&false))) {{
                            __CLR4_4_1mmlwzoeioq.R.inc(242);randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        } }else {{
                            __CLR4_4_1mmlwzoeioq.R.inc(243);randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        }
                        }__CLR4_4_1mmlwzoeioq.R.inc(244);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(245);break;
                case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(246);__CLB4_4_1_bool0=true;} // Contains numbers and special characters
                    __CLR4_4_1mmlwzoeioq.R.inc(247);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(248)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(249)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(250);char randomChar;
                        __CLR4_4_1mmlwzoeioq.R.inc(251);if ((((random.nextBoolean())&&(__CLR4_4_1mmlwzoeioq.R.iget(252)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(253)==0&false))) {{
                            __CLR4_4_1mmlwzoeioq.R.inc(254);randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        } }else {{
                            __CLR4_4_1mmlwzoeioq.R.inc(255);randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        }
                        }__CLR4_4_1mmlwzoeioq.R.inc(256);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(257);break;
                case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(258);__CLB4_4_1_bool0=true;} // Contains letters and special characters
                    __CLR4_4_1mmlwzoeioq.R.inc(259);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(260)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(261)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(262);char randomChar;
                        __CLR4_4_1mmlwzoeioq.R.inc(263);if ((((random.nextBoolean())&&(__CLR4_4_1mmlwzoeioq.R.iget(264)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(265)==0&false))) {{
                            __CLR4_4_1mmlwzoeioq.R.inc(266);randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        } }else {{
                            __CLR4_4_1mmlwzoeioq.R.inc(267);randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        }
                        }__CLR4_4_1mmlwzoeioq.R.inc(268);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(269);break;
                case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(270);__CLB4_4_1_bool0=true;} // Contains letters, numbers, and special characters
                    __CLR4_4_1mmlwzoeioq.R.inc(271);for (int j = 0; (((j < titleLength)&&(__CLR4_4_1mmlwzoeioq.R.iget(272)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(273)==0&false)); j++) {{
                        __CLR4_4_1mmlwzoeioq.R.inc(274);char randomChar;
                        __CLR4_4_1mmlwzoeioq.R.inc(275);if ((((random.nextBoolean())&&(__CLR4_4_1mmlwzoeioq.R.iget(276)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(277)==0&false))) {{
                            __CLR4_4_1mmlwzoeioq.R.inc(278);randomChar = (char) (random.nextInt(26) + 'a'); // ASCII 'a' to 'z'
                        } }else {__CLR4_4_1mmlwzoeioq.R.inc(279);if ((((random.nextBoolean())&&(__CLR4_4_1mmlwzoeioq.R.iget(280)!=0|true))||(__CLR4_4_1mmlwzoeioq.R.iget(281)==0&false))) {{
                            __CLR4_4_1mmlwzoeioq.R.inc(282);randomChar = (char) (random.nextInt(10) + '0'); // ASCII '0' to '9'
                        } }else {{
                            __CLR4_4_1mmlwzoeioq.R.inc(283);randomChar = (char) (random.nextInt(15) + 33); // ASCII symbols starting from '!'
                        }
                        }}__CLR4_4_1mmlwzoeioq.R.inc(284);title.append(randomChar);
                    }
                    }__CLR4_4_1mmlwzoeioq.R.inc(285);break;
                case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_1mmlwzoeioq.R.inc(286);__CLB4_4_1_bool0=true;} // Custom input
                    __CLR4_4_1mmlwzoeioq.R.inc(287);String[] customTitles = customInputArea.getText().split("\n");
                    __CLR4_4_1mmlwzoeioq.R.inc(288);titles.addAll(Arrays.asList(customTitles));
                    __CLR4_4_1mmlwzoeioq.R.inc(289);title.append(customTitles);
                    __CLR4_4_1mmlwzoeioq.R.inc(290);return titles;
            }


            __CLR4_4_1mmlwzoeioq.R.inc(291);titles.add(title.toString());
        }
        }__CLR4_4_1mmlwzoeioq.R.inc(292);return titles;
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    private void writeInputFile(List<String> titles) throws IOException {try{__CLR4_4_1mmlwzoeioq.R.inc(293);
        __CLR4_4_1mmlwzoeioq.R.inc(294);BufferedWriter writer = new BufferedWriter(new FileWriter(INPUT_FILE));
        __CLR4_4_1mmlwzoeioq.R.inc(295);for (String title : titles) {{
            __CLR4_4_1mmlwzoeioq.R.inc(296);writer.write(title);
            __CLR4_4_1mmlwzoeioq.R.inc(297);writer.newLine();
        }
        }__CLR4_4_1mmlwzoeioq.R.inc(298);writer.close();
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1mmlwzoeioq.R.inc(299);
        __CLR4_4_1mmlwzoeioq.R.inc(300);SwingUtilities.invokeLater(() -> {
            __CLR4_4_1mmlwzoeioq.R.inc(301);FuzzTester tester = new FuzzTester();
            __CLR4_4_1mmlwzoeioq.R.inc(302);tester.setVisible(true);
        });
    }finally{__CLR4_4_1mmlwzoeioq.R.flushNeeded();}}
}
