import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int QUARTERS_PER_DOLLAR = 4;

        System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, or 10 = $10): ");
        int billValue = in.nextInt();
        System.out.print("Enter number of quarters inserted: ");
        int quarterAmount = in.nextInt();
        System.out.print("Enter item price in quarters: ");
        int itemPrice = in.nextInt();

        // Compute change due
        int userMoney = billValue * QUARTERS_PER_DOLLAR + quarterAmount;
        int changeDue = userMoney - itemPrice;
        int dollarCoins = changeDue / QUARTERS_PER_DOLLAR;
        changeDue = changeDue % QUARTERS_PER_DOLLAR;
        int quarters = changeDue;

        // Print change due

        System.out.println();
        System.out.println("Your change is:");
        System.out.printf("Dollar coins: %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quarters: %6d", quarters);
        System.out.println();
    }
}
