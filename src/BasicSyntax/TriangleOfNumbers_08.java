package BasicSyntax;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= num; i++){
            System.out.println(printNumRow(i));
        }
    }

    public static StringBuilder printNumRow(int num){
        StringBuilder row = new StringBuilder(String.valueOf(num));
        for(int i = 1; i < num; i++){
            row.append(" ").append(num);
        }
        return row;
    }
}
