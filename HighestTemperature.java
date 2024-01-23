import java.util.Scanner;

public class HighestTemperature {
    public static void main(String[] args) {
        int currentMonth = 1;
        System.out.println("Welcome");
        System.out.println("Please enter the temperature for month: " + currentMonth);
        Scanner in = new Scanner(System.in);
        double highestValue;
        highestValue = in.nextDouble();
        int highestMonth = 1;
        for (currentMonth = 2; currentMonth <= 12; currentMonth++)
        {
            System.out.println("Please enter the temperature for month: " + currentMonth);
            double nextValue = in.nextDouble();
            if (nextValue > highestValue)
            {
                highestValue = nextValue;
                highestMonth = currentMonth;
            }
        }
        System.out.println("The highest temperature was: " + highestValue);
        System.out.println("The highest month was: " + highestMonth);
    }
}
