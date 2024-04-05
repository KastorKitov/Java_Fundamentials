package DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int originalPower = Integer.parseInt(scanner.nextLine());
        int power = originalPower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokeCounter = 0;
        while (power >= distance){

            if((originalPower/2) == power){
                power = power / exhaustionFactor;
            }else{
                power -= distance;
                pokeCounter ++;
            }
        }

        System.out.println(power);
        System.out.println(pokeCounter);

    }
}
