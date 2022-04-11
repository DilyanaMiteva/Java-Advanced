import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for (double number : numbers) {
            if (!map.containsKey(number)){
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        map.entrySet().stream().forEach(e -> System.out.printf("%.1f -> %d%n", e.getKey(), e.getValue()));

    }
}
