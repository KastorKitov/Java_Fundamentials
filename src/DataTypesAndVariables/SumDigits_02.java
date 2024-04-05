package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String integer = scanner.nextLine();
        int sum = 0;

        for(int i = 0; i <= integer.length() - 1; i++){
            sum += Integer.parseInt(String.valueOf(integer.charAt(i)));
        }

        System.out.println(sum);
    }
}
