import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();

        String name = scanner.nextLine();
        String email = scanner.nextLine();

        while (!name.equals("stop") ) {
            String domainEnd = email.substring(email.length() - 2, email.length());
            if (domainEnd.equals("bg")) {

                map.put(name, email);
                // S,K,M
            }

            name = scanner.nextLine();
            if (!name.equals("stop")){
                email = scanner.nextLine();
            }
        }

        map.entrySet().stream().forEach((kv) -> {
            System.out.println(String.format("%s -> %s", kv.getKey(), kv.getValue()));
        });
    }
}
