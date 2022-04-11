import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> symbols = new TreeMap<>();

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            symbols.putIfAbsent(symbol, 0);
            symbols.put(symbol, symbols.get(symbol) + 1);
        }

        symbols.entrySet().stream().forEach(kvp -> {
            System.out.println(String.format("%c: %d time/s", kvp.getKey(), kvp.getValue()));
        });
    }
}
