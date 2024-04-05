package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfTheAsciiTable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for(int code = beginCode; code <= endCode; code ++){
            System.out.print((char) code + " ");
        }

    }
}
