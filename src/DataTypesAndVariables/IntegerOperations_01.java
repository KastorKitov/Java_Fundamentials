package DataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());
        int forthInt = Integer.parseInt(scanner.nextLine());

        int sum = ( (firstInt + secondInt) / thirdInt ) * forthInt;

        System.out.println(sum);

    }
}
