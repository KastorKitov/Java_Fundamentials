package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Agd#53Dfg^&4F53
        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {
                digitSb.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterSb.append(symbol);
            } else {
                otherSb.append(symbol);
            }
        }

        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
