package Methods;

import java.util.Scanner;

public class AddSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sum(number1, number2);
        int subtractOfNumbers = subtract(sumOfNumbers, number3);

        System.out.println(subtractOfNumbers);
    }

    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    public static int subtract(int n1, int n2){
        return n1 - n2;
    }
}
