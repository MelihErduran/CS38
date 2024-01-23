import java.util.Scanner;

public class DataSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double smallest = Double.MAX_VALUE;
        double largest = Double.MIN_VALUE;
        int counter = 0;

        System.out.println("Enter a series of floating-point numbers (or any non-double value to exit):");


        while (in.hasNextDouble()) {
            double number = in.nextDouble();

            sum += number;
            counter++;

            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        if (counter > 0) {
            double average = sum / counter;
            double range = largest - smallest;
            System.out.println("Data Set                      Value");
            System.out.printf("The average of the values is: %5.2f\n", average);
            System.out.printf("The smallest value is:        %5.2f\n", smallest);
            System.out.printf("The largest value is:         %5.2f\n", largest);
            System.out.printf("The range is:                 %5.2f\n", range);
        }
    }
}
