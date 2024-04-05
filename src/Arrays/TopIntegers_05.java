package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int counter = 1;

        for(int num : numbers){
            if(num > numbers[counter]){
                System.out.print(num + " ");
            }
            counter++;
            if(counter == numbers.length){
                System.out.print(numbers[numbers.length - 1]);
                break;
            }
        }
    }
}
