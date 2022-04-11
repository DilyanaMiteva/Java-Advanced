import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> map = new TreeMap<>();

        while (n-- > 0) {
            String[] student = scanner.nextLine().split("\\s+");
            String name = student[0];
            double grade = Double.parseDouble(student[1]);

            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }

            map.get(name).add(grade);
        }

        map.entrySet().stream().forEach(a -> {
            double sum = 0;
            System.out.printf("%s -> ", a.getKey());

            for (double grade : a.getValue()) {
                System.out.printf("%.2f ", grade);
                sum += grade;
            }
            double avg = sum / a.getValue().size();

            System.out.println(String.format("(avg: %.2f)", avg));

        });
    }
}
