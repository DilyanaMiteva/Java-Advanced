import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = tokens[0];
        int cols = tokens[1];

        int[][] matrix = new int[rows][cols];

        char startSymbol = 'a';
        char nextSymbol = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(startSymbol + "" + (char)(startSymbol + nextSymbol) + startSymbol + " ");
                nextSymbol++;
            }
            startSymbol++;
            nextSymbol = 0;
            System.out.println();
        }


    }
}
