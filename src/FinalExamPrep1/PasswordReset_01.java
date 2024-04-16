package FinalExamPrep1;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            String[] commandRow = command.split(" ");

            if (commandRow[0].equals("TakeOdd")) {
                String newPassword = "";
                for (int i = 0; i<= password.length() - 1; i++ ) {
                    if ( i % 2 != 0) {
                        newPassword = newPassword + password.charAt(i);
                    }
                }
                password = newPassword;
                System.out.println(newPassword);
            } else if (commandRow[0].equals("Cut")) {
                String partBefore = password.substring(0, Integer.parseInt(commandRow[1]));
                String partAfter = password.substring(Integer.parseInt(commandRow[1]) + Integer.parseInt(commandRow[2]));

                password = partBefore + partAfter;
                System.out.println(password);
            } else if (commandRow[0].equals("Substitute")) {
                if (password.contains(commandRow[1])) {
                    while (password.contains(commandRow[1])) {
                        password = password.replace(commandRow[1],commandRow[2]);
                    }
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }


            command = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }
}
