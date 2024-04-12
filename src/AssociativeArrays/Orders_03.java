package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double oldPrice = 0 ;
        double oldQuantities = 0;
        String lineInput = scanner.nextLine();
        Map<String,Double> orders = new LinkedHashMap<>();
        Map<String,Double> oldOrder = new LinkedHashMap<>();
        Map<String,Double> oldPriceOrder = new LinkedHashMap<>();
        while (!lineInput.equals("buy")){
            String nameOfProduct = lineInput.split(" ")[0];
            double price = Double.parseDouble(lineInput.split(" ")[1]);
            double quantities = Integer.parseInt(lineInput.split(" ")[2]);




            if (orders.containsKey(nameOfProduct)) {


                quantities += oldOrder.get(nameOfProduct);
                if (price == oldPrice){
                    quantities *= price;
                }else {
                    quantities *= price;
                }



                orders.put(nameOfProduct, quantities );



            }else {
                oldQuantities = quantities;
                oldPrice = price;
                quantities *= price;
                orders.put(nameOfProduct, quantities);


                oldOrder.put(nameOfProduct,oldQuantities);
                oldPriceOrder.put(nameOfProduct,oldPrice);
            }

            lineInput = scanner.nextLine();
        }
        for (Map.Entry<String, Double>entry:orders.entrySet()) {
            System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue());

        }

    }
}
