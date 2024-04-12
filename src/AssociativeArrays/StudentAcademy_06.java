package AssociativeArrays;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int student = 1; student <= countStudents; student++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsGrade.putIfAbsent(name, new ArrayList<>());
            studentsGrade.get(name).add(grade);
        }

        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry: studentsGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);

            if (averageGrade >= 4.50) {
                averageGradeStudents.put(studentName, averageGrade);
            }
        }

        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));


    }

    public static double getAverageGrade(List<Double> list) {

        double sumGrades = 0;

        for (double grade : list) {
            sumGrades += grade;
        }

        return sumGrades / list.size();
    }
}
