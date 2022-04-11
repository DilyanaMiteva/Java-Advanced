import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> map = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNumber = tokens[1];
            map.put(name, phoneNumber);

            input = scanner.nextLine();
        }
        String name = "";

        while (!"stop".equals(name = scanner.nextLine())){

            if (map.containsKey(name)) {
                System.out.println(String.format("%s -> %s", name, map.get(name)));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
        }

    }
}
