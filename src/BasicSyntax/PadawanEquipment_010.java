package BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double ropePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double freeBelts = Math.floor((double) studentsCount / 6);
        double totalSum = 0;

        //sum
        totalSum = (((int) Math.ceil((studentsCount * 1.1)) * lightsaberPrice) + (studentsCount * ropePrice) + ((studentsCount - freeBelts) * beltPrice));

        if(money >= totalSum){
            System.out.println("The money is enough - it would cost " + String.format("%.2f", totalSum) + "lv.");
        }else{
            System.out.println("George Lucas will need " + String.format("%.2f", totalSum - money) + "lv more.");
        }



    }
}
