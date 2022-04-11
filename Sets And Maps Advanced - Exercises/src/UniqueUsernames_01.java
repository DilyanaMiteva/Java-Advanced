import java.util.*;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> names = new LinkedHashSet<>();

        while (n-- > 0) {
            String input = scanner.nextLine();
            names.add(input);
        }

        names.stream().forEach(e -> System.out.println(e));
    }
}
