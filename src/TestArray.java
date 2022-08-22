import java.util.Arrays;
import java.util.Random;

public class TestArray {

    // Program which takes 10 random values stored in an array and adds them and finds their average
    public static void main(String[] args) {
        // Initialise the variables
        int sum = 0;
        double average = 0.0;
        int numbers[] = new int[10];
        Random rand = new Random(); // Set up the random number generator

        // Loop that iterates through the array to add each value in the array onto sum
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(0, 100);  // Generating from 0 to 100 in order to not get any ridiculous values
            sum = sum + numbers[i]; // SUM CALCULATION
            System.out.print(numbers[i] + "  ");    // This is to check that the output is correct
        }

        average = (double) sum / numbers.length;    // AVERAGE CALCULATION

        // Outputs
        System.out.println();
        System.out.println("Sum of Array: " + sum);
        System.out.println("Average of Array " + average);
    }
}
