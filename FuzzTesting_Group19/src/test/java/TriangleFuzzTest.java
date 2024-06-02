import java.util.Random;

public class TriangleFuzzTest {

    public static void main(String[] args) {
        int maxIterations = 10;
        Random rand = new Random();
        int upperBound = 10;
        int[] outputs = new int[5]; // To track each unique output

        long startTime = System.currentTimeMillis();
        int i;
        for (i = 0; i < maxIterations; i++) {
            int a = rand.nextInt(upperBound); // Generate random integers upto upperBound
            int b = rand.nextInt(upperBound);
            int c = rand.nextInt(upperBound);

            String result = TriangleProgram.triangle(a, b, c);
            System.out.println("Test " + (i + 1) + ": " + a + ", " + b + ", " + c + " -> " + result);

            if (result.equals("non-triangle")) {
                outputs[0]++;
            } else if (result.equals("equilateral triangle")) {
                outputs[1]++;
            } else if (result.equals("isosceles triangle")) {
                outputs[2]++;
            } else if (result.equals("triangle")) {
                outputs[3]++;
            } else if (result.equals("")) {
                outputs[4]++; // Capture any errors or undefined results
            }

            // Check if all possible outputs have been found
            if (outputs[0] > 0 && outputs[1] > 0 && outputs[2] > 0 && outputs[3] > 0) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Print the results
        System.out.println("Fuzz Testing Results:");
        System.out.println("Non-triangle: " + outputs[0]);
        System.out.println("Equilateral triangle: " + outputs[1]);
        System.out.println("Isosceles triangle: " + outputs[2]);
        System.out.println("Ordinary triangle: " + outputs[3]);
        System.out.println("Errors: " + outputs[4]);
        System.out.println("Total iterations: " + i);
        System.out.println("Time taken: " + duration + " ms");
    }
}

