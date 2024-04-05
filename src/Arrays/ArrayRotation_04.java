package Arrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for(int rotation = 1; rotation <= rotations; rotation++){
            String firstNumber = numbers[0];

            for(int index = 0; index < numbers.length - 1; index++){
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firstNumber;
        }

        System.out.println(String.join(" ", numbers));
    }
}
