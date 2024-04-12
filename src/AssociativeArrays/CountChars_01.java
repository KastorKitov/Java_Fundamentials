package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {

            if (symbol == ' '){
                continue;
            }

            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            }else {
               symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
