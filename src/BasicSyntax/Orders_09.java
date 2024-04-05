package BasicSyntax;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for(int i = 1; i <= countOfOrders; i++){

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double price = (days * capsulesCount) * pricePerCapsule;
            System.out.println("The price for the coffee is: $" + String.format("%.2f", price));

            totalPrice += price;
        }

        System.out.println("Total: $" + String.format("%.2f", totalPrice));
    }
}
