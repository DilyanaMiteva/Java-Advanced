import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] token = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(token[0]);
        int s = Integer.parseInt(token[1]);
        int x = Integer.parseInt(token[2]);

        String[] tokens = scanner.nextLine().split("\\s+");
        for (int i = 0; i < tokens.length; i++) {
            stack.push(Integer.parseInt(tokens[i]));
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(stack));
        }

    }

}
