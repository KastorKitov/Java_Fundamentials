package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int highestSnowballValue = 0;
        int highestSnowballSnow = 0;
        int highestSnowballTime = 0;
        int highestSnowballQuality = 0;

        for(int i = 1; i <= numberOfSnowballs; i++){
            double snowballSnow = Integer.parseInt(scanner.nextLine());
            double snowballTime = Integer.parseInt(scanner.nextLine());
            double snowballQuality = Integer.parseInt(scanner.nextLine());

            int snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);
            if(snowballValue > highestSnowballValue){
                highestSnowballValue = snowballValue;
                highestSnowballSnow = (int) snowballSnow;
                highestSnowballTime = (int) snowballTime;
                highestSnowballQuality = (int) snowballQuality;
            }
        }

        System.out.println(highestSnowballSnow + " : " + highestSnowballTime + " = " + highestSnowballValue + " (" + highestSnowballQuality + ")");
    }
}
