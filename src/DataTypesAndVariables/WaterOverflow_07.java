package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int pouredLiters = 0;

        for(int i = 0; i < numberOfLines; i++){
            int litersToPour = Integer.parseInt(scanner.nextLine());
                if((pouredLiters + litersToPour) <= capacity){
                    pouredLiters += litersToPour;
                }else{
                    System.out.println("Insufficient capacity!");
                }
        }

        System.out.println(pouredLiters);
    }
}
