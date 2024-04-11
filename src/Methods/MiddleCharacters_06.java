package Methods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = scanner.nextLine().split("");

        int stringLength = stringArray.length;

        if(stringLength % 2 == 0){
            System.out.print(stringArray[(stringLength/2) - 1]);
            System.out.println(stringArray[stringLength/2]);
        }else{
            System.out.println(stringArray[stringLength/2]);
        }
    }

}
