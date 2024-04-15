package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String reversedWord = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                char currentSymbol = input.charAt(i);
                reversedWord = reversedWord + currentSymbol;
            }

            System.out.printf("%s = %s%n", input, reversedWord);

            input = scanner.nextLine();
        }
    }
}
