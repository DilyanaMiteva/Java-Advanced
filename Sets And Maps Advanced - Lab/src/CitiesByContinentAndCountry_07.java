import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!map.containsKey(continent)) {
                map.put(continent, new LinkedHashMap<>());
                if (!map.get(continent).containsKey(country)) {
                    map.get(continent).put(country, new ArrayList<>());
                }
                map.get(continent).get(country).add(city);
            } else {
                if (!map.get(continent).containsKey(country)) {
                    map.get(continent).put(country, new ArrayList<>());
                }
                map.get(continent).get(country).add(city);
            }
        }

        map.entrySet().stream().forEach(kvp -> {
            System.out.println(kvp.getKey() + ":");

            for (Map.Entry<String, List<String>> country : kvp.getValue().entrySet()) {
                System.out.println("  " + country.getKey() + " -> " + country.getValue().toString().replaceAll("\\]|\\[", ""));
            }
        });
    }
}
