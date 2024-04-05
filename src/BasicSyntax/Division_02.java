package BasicSyntax;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        String outputText = "";

        if(inputNumber % 10 == 0){
            outputText = "The number is divisible by 10";
        }else if (inputNumber % 7 == 0){
            outputText = "The number is divisible by 7";
        }else if (inputNumber % 6 == 0){
            outputText = "The number is divisible by 6";
        }
        else if (inputNumber % 3 == 0){
            outputText = "The number is divisible by 3";
        }
        else if (inputNumber % 2 == 0){
            outputText = "The number is divisible by 2";
        }else{
            outputText = "Not divisible";
        }

        System.out.println(outputText);
    }
}
