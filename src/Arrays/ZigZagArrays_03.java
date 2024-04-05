package Arrays;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scanner.nextLine());
        String [] firstArray = new String[numberOfRows];
        String [] secondArray = new String[numberOfRows];

        for(int i = 1; i <= numberOfRows; i++){

            String [] row = scanner.nextLine().split(" ");

            if(i % 2 == 0){
                firstArray[i-1] = row[1];
                secondArray[i-1] = row[0];
            }else{
                firstArray[i-1] = row[0];
                secondArray[i-1] = row[1];
            }
        }

        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
