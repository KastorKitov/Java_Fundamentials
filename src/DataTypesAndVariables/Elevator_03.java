package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double persons = Integer.parseInt(scanner.nextLine());
        double capacity = Integer.parseInt(scanner.nextLine());

        double result = Math.ceil(persons/capacity);

        System.out.println( (int)result );

    }
}
