import java.util.*;

public class AMinerTask_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Integer>> resources = new LinkedHashMap<>();

        String line = "";

        while(!"stop".equals(line = sc.nextLine())) {
            String resource = line;
            int quantity = Integer.parseInt(sc.nextLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, new ArrayList<>());
            }

            resources.get(resource).add(quantity);
        }

        resources.entrySet().stream().forEach(kvp -> {
            int sum = kvp.getValue().stream().mapToInt(Integer::intValue).sum();
            System.out.println(String.format("%s -> %d", kvp.getKey(), sum));
        });

    }
}
