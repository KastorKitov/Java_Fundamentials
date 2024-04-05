package Arrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String [] firstArray = firstString.split(" ");
        String [] secondArray = secondString.split(" ");

        for (String elementSecondArray : secondArray){

            for (String elementFirstArray : firstArray){
                if(elementSecondArray.equals(elementFirstArray)){
                    System.out.print(elementFirstArray + " ");
                    break;
                }
            }
        }

    }
}
