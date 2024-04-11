package Lists;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] commandLine = scanner.nextLine().split(" ");

        while(!commandLine[0].equals("end")){

            if(commandLine[0].equals("Delete")){
                while(intList.contains(Integer.parseInt(commandLine[1]))){
                    intList.remove(Integer.valueOf(Integer.parseInt(commandLine[1])));
                }
            }else if(commandLine[0].equals("Insert")){
                intList.add(Integer.parseInt(commandLine[2]),Integer.parseInt(commandLine[1]));
            }

            commandLine = scanner.nextLine().split(" ");
        }

        for( int i : intList){
            System.out.print(i + " ");
        }
    }
}
