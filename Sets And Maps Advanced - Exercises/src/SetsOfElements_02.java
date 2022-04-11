import java.util.*;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = tokens[0];
        int m = tokens[1];

        LinkedHashSet<Integer> fSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> sSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            fSet.add(num);
        }
        for (int i = 0; i < m; i++) {
            int num = scanner.nextInt();
            sSet.add(num);
        }
        fSet.retainAll(sSet);

        for (Integer integer : fSet) {
            System.out.print(integer+ " ");
        }
    }
}
