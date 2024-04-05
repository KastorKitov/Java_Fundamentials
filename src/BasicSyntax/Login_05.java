package BasicSyntax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String passwordInput = scanner.nextLine();
        int attempts = 0;

        while(!passwordInput.equals(password)){
            attempts ++;

            if(attempts == 4){
                System.out.println("User " + username + " blocked!");
                break;
            }

            System.out.println("Incorrect password. Try again.");

            passwordInput = scanner.nextLine();

        }

        if(passwordInput.equals(password)) {
            System.out.println("User " + username + " logged in.");
        }

    }
}
