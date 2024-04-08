package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialItems = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){

            String[] commandLine = command.split(" ");

            switch (commandLine[0]){
                case "Loot": {
                    for(int i = 1; i<= commandLine.length -1; i++){
                        if(!Arrays.asList(initialItems).contains(commandLine[i])) {
                            String[] newArray = new String[initialItems.length + 1];
                            newArray[0] = commandLine[i];
                            for (int a = 0; a < initialItems.length; a++) {
                                newArray[a + 1] = initialItems[a];
                            }
                            initialItems = newArray;
                        }
                    }
                    break;
                }
                case "Drop": {
                    int index = Integer.parseInt(commandLine[1]);
                    if(index < 0 || index >= initialItems.length){
                        break;
                    }else{
                        String temp = initialItems[index];

                        for (int i = index; i < initialItems.length - 1; i++) {
                            initialItems[i] = initialItems[i + 1];
                        }

                        initialItems[initialItems.length - 1] = temp;
                    }
                    break;
                }
                case "Steal": {
                    int stolenItemsCount = Integer.parseInt(commandLine[1]);

                    if(stolenItemsCount >= initialItems.length){
                        for(String item : initialItems){
                            if(item.equals(initialItems[initialItems.length - 1])){
                                System.out.print(item);
                            }else {
                                System.out.print(item + ", ");
                            }
                        }
                        initialItems = new String[0];
                    }else{
                        String[] newArray = new String[initialItems.length - stolenItemsCount];
                        String[] stolenItems = new String[stolenItemsCount];

                        System.arraycopy(initialItems, initialItems.length - stolenItemsCount, stolenItems, 0, stolenItemsCount);

                        for(String item : stolenItems){
                            if(item.equals(initialItems[initialItems.length - 1])){
                                System.out.print(item);
                            }else {
                                System.out.print(item + ", ");
                            }
                        }

                        System.arraycopy(initialItems, 0, newArray, 0, initialItems.length - stolenItemsCount);

                        initialItems = newArray;
                    }

                    break;
                }
                default:{
                    break;
                }
            }

            command = scanner.nextLine();
        }

        int itemsCount = initialItems.length;
        if(itemsCount == 0){
            System.out.print("Failed treasure hunt.");
        }else{
            int totalLength = 0;

            for (String item : initialItems) {
                if (item != null) {
                    totalLength += item.length();
                }
            }

            double avgTreasureGain = totalLength / itemsCount;

            System.out.print("Average treasure gain:" + String.format("%.2f", avgTreasureGain) + " pirate credits.");
        }
    }
}
