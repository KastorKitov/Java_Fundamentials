package Arrays;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        String finalString = "";
        int sumOfPeople = 0;

        for(int i = 1; i <= numberOfWagons; i++){
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            finalString += (numberOfPeople + " ");
            sumOfPeople += numberOfPeople;
        }
        System.out.println(finalString);
        System.out.println(sumOfPeople);
    }
}
