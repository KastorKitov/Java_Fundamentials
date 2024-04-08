package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while(!command.equals("end")){

            String[] commandLine = command.split(" ");

            switch (commandLine[0]){
                case "swap": {
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);
                    int firstNumber = numbers[firstIndex];

                    numbers[firstIndex] = numbers[secondIndex];
                    numbers[secondIndex] = firstNumber;

                    break;
                }
                case "multiply": {
                    int firstIndex = Integer.parseInt(commandLine[1]);
                    int secondIndex = Integer.parseInt(commandLine[2]);

                    numbers[firstIndex] = numbers[firstIndex] * numbers[secondIndex];
                    break;
                }
                case "decrease": {
                    for(int index = 0; index <= numbers.length -1; index++){
                        numbers[index] = numbers[index] - 1;
                    }
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }

        for(int num : numbers){
            if(num == numbers[numbers.length - 1]){
                System.out.print(num);
            }else{
                System.out.print(num + ", ");
            }
        }
    }
}
