package DataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());
        int spicesSum = 0;
        int daysOperated = 0;

        while(source >= 100){
            if(source >= 26){
                spicesSum += (source - 26);
            }
            source -= 10;
            daysOperated += 1;
        }
        if(source >= 26){
            spicesSum -= 26;
        }else{
            spicesSum -= source;
        }

        System.out.println(daysOperated);
        System.out.println(spicesSum);
    }
}
