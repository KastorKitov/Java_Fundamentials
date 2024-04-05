package BasicSyntax;

import java.util.Scanner;

public class RageExpenses_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double trashedHeadsetCount = Math.floor((double) lostGamesCount / 2);
        double trashedMouseCount = Math.floor((double) lostGamesCount / 3);
        double trashedKeyboardCount = Math.floor((double) lostGamesCount / 6);
        double trashedDisplayCount = Math.floor((double) lostGamesCount / 12);


        double expenses = (trashedHeadsetCount * headsetPrice) + (trashedMouseCount * mousePrice) +
                (trashedKeyboardCount * keyboardPrice) + (trashedDisplayCount * displayPrice);

        System.out.println("Rage expenses: " + String.format("%.2f", expenses) + " lv.");

    }
}
