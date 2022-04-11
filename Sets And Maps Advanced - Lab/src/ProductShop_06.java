import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Map<String, Double>> map = new TreeMap<>();

        String line = "";

        while (!"Revision".equals(line = sc.nextLine())) {
            String[] tokens = line.split(",\\s+");
            String market = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            if (!map.containsKey(market)) {
                map.put(market, new LinkedHashMap<>());
                if (!map.get(market).containsKey(product)) {
                    map.get(market).put(product, price);
                }
                map.get(market).put(product, price);
            } else {
                if (!map.get(market).containsKey(product)) {
                    map.get(market).put(product, price);
                }
                map.get(market).put(product, price);
            }
        }

        map.entrySet().stream().forEach(kvp -> {
            System.out.println(kvp.getKey() + "->");
            for (Map.Entry<String, Double> product : kvp.getValue().entrySet()) {
                System.out.println(String.format("Product: %s, Price: %.1f", product.getKey(), product.getValue()));
            }
        });
    }
}
