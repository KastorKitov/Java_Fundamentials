package BasicSyntax;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firtsNum = Integer.parseInt(scanner.nextLine());
        int secoundNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = firtsNum; i <= secoundNum; i++){
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);

    }
}
