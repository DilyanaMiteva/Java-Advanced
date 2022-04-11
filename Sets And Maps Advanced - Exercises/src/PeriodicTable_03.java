import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            for (String element : elements) {
                set.add(element);
            }

        }

        set.stream().sorted().forEach(e -> System.out.print(e + " "));
    }
}
