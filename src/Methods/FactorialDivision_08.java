package Methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactorial(number1);
        long fact2 = calculateFactorial(number2);

        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);

    }

    public static long calculateFactorial(int number){
        //5! = 1 * 2 * 3 * 4 * 5 = 120
        long fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }

        return fact;
    }
}
