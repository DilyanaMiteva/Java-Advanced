import java.util.ArrayDeque;
import java.util.Map;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "1":
                    int element = Integer.parseInt(tokens[1]);
                    stack.push(element);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int maxElement = Integer.MIN_VALUE;
                    for (Integer integer : stack) {
                        if (integer > maxElement) {
                            maxElement = integer;
                        }
                    }
                    System.out.println(maxElement);
                    break;
            }
        }

    }
}
