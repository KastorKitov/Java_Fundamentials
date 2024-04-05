package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        String biggestKegName = "";
        int biggestKegVolume = 0;

        for(int i=0; i < numberOfKegs; i ++){
            String kegName = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            int volume = (int) (3.14 * (radius * radius) * height);

            if(biggestKegVolume < volume){
                biggestKegVolume = volume;
                biggestKegName = kegName;
            }
        }

        System.out.println(biggestKegName);

    }
}
