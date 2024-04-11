package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> peopleList = new ArrayList<>();

        for (int i = 1; i <= commandsCount; i++){
            String[] line = scanner.nextLine().split(" ");
            if(line[2].equals("not")){
                if(peopleList.contains(line[0])){
                    peopleList.remove(line[0]);
                }else{
                    System.out.println(line[0] + " is not in the list!");
                }
            }else{
                if(peopleList.contains(line[0])){
                    System.out.println(line[0] + " is already in the list!");
                }else{
                    peopleList.add(line[0]);
                }
            }
        }

        for(String person : peopleList){
            System.out.println(person);
        }

    }
}
