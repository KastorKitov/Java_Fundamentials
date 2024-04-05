package BasicSyntax;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = Integer.parseInt(scanner.nextLine());

        if(isStrongNumber(num)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }

    public static boolean isStrongNumber(int number){
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0){
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static int factorial(int number){
        if(number == 0) return 1;
        int factorial = 1;
        for(int i=1; i <= number; i++){
            factorial *=i;
        }
        return factorial;
    }
}
