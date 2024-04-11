package Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if(validate(password)){
            System.out.println("Password is valid");
        }

    }

    public static boolean validate(String password){

        boolean valid = false;

        if(password.length() >= 6 && password.length() <= 10){
            valid = true;
        }else{
            System.out.println("Password must be between 6 and 10 characters");
            valid = false;
        }

        if(password.matches("^[a-zA-Z0-9]+$")){
            valid = true;
        }else{
            System.out.println("Password must consist only of letters and digits");
            valid = false;
        }

        int digitsCount = 0;

        for(char symbol : password.toCharArray()){
            if(Character.isDigit(symbol)){
                digitsCount++;
            }
        }

        if(digitsCount >= 2){
            valid = true;
        }else{
            System.out.println("Password must have at least 2 digits");
            valid = false;
        }

        return valid;
    }
}
