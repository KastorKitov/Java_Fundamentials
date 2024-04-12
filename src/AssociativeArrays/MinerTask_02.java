package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        int counter = 1;
        Map<String , Integer> oreCount = new LinkedHashMap<>();

        while (!lineInput.equals("stop")){

            int quantities = Integer.parseInt(scanner.nextLine());

            if (oreCount.containsKey(lineInput)) {
                oreCount.put(lineInput, oreCount.get(lineInput)+ quantities);

            }else {
                oreCount.put(lineInput, quantities);
            }



            counter++;
            lineInput = scanner.nextLine();
        }
        for (Map.Entry<String,Integer> entry:oreCount.entrySet()) {
            System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
        }

    }
}
