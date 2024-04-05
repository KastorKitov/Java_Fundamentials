package BasicSyntax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int personCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;
        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 9.80;
                } else {
                    pricePerPerson = 10.46;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 15.60;
                } else {
                    pricePerPerson = 16;
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 15;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 20;
                } else {
                    pricePerPerson = 22.50;
                }
                break;
        }
        totalPrice = pricePerPerson * personCount;

        if(personCount >= 30 && groupType.equals("Students")){
            totalPrice = totalPrice * 0.85;
        }else if(personCount >= 100 && groupType.equals("Business")){
            totalPrice = totalPrice - (10*pricePerPerson);
        }else if(personCount >= 10 && personCount <= 20 && groupType.equals("Regular")){
            totalPrice = totalPrice * 0.95;
        }

        System.out.println("Total price: " + String.format("%.2f", totalPrice));

    }
}
