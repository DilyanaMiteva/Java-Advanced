import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int rightDigit = Integer.parseInt(tokens[i + 1]);
                int leftDigit = stack.peek();
                stack.push(rightDigit);
                if (token.equals("+")){
                    stack.push(add(leftDigit, rightDigit));
                    i++;
                } else {
                    stack.push(subtract(leftDigit, rightDigit));
                    i++;
                }
            }

        }
        System.out.println(stack.peek());
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

}
