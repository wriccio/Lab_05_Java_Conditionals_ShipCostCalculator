//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class ShippingCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Variable Declarations
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
        String trash = "";
        // input values from the user
        System.out.print("Please enter the price of your item: ");
        if (in.hasNextDouble()) {
            // OK safe to read in a double
            itemPrice = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
            // process them
            if (itemPrice >= 100.00) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }
            totalCost = itemPrice + shippingCost;
            // output
            System.out.println("Your total cost is: " + totalCost);
        } else {
            // Not a double, so can't use nextDouble()!
            trash = in.nextLine();
            System.out.println("\nYou entered: " + trash);
            System.out.println("Run the program again and enter a valid price!");
        }
    }
}
