package BasicSyntax;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalSumOfMoney = 0;

        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);

            if(coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                totalSumOfMoney += coin;
            }else{
                System.out.println("Cannot accept " + String.format("%.2f", coin));
            }

            input = scanner.nextLine();

        }

        while (!input.equals("End")){
            input = scanner.nextLine();
            switch (input){

                case "Nuts":
                    if(totalSumOfMoney < 2.0){
                        System.out.println("Sorry, not enough money");
                    }else{
                        totalSumOfMoney -= 2.0;
                        System.out.println("Purchased " + input);
                    }
                    break;
                case "Water":
                    if(totalSumOfMoney < 0.7){
                        System.out.println("Sorry, not enough money");
                    }else{
                        totalSumOfMoney -= 0.7;
                        System.out.println("Purchased " + input);
                    }
                    break;
                case "Crisps":
                    if(totalSumOfMoney < 1.5){
                        System.out.println("Sorry, not enough money");
                    }else{
                        totalSumOfMoney -= 1.5;
                        System.out.println("Purchased " + input);
                    }
                    break;
                case "Soda":
                    if(totalSumOfMoney < 0.8){
                        System.out.println("Sorry, not enough money");
                    }else{
                        totalSumOfMoney -= 0.8;
                        System.out.println("Purchased " + input);
                    }
                    break;
                case "Coke":
                    if(totalSumOfMoney < 1.0){
                        System.out.println("Sorry, not enough money");
                    }else{
                        totalSumOfMoney -= 1.0;
                        System.out.println("Purchased " + input);
                    }
                    break;
                case "End":
                    break;
                default:
                    System.out.println("Invalid product");
            }

        }
        System.out.println("Change: " + String.format("%.2f", totalSumOfMoney));
    }
}
