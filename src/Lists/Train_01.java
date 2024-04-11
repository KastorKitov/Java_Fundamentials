package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while(!command.equals("end")){

            String[] commandArray = command.split(" ");

            if(commandArray[0].equals("Add")){
                wagonList.add(Integer.parseInt(commandArray[1]));
            }else{
                int passengers = Integer.parseInt(commandArray[0]);
                for(int i = 0; i < wagonList.size(); i++){
                    if((passengers+wagonList.get(i)) <= maxWagonCapacity){
                        wagonList.set(i, passengers+wagonList.get(i));
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for(int wagon : wagonList){
            System.out.print(wagon + " ");
        }

    }
}
