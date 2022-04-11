import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] ints = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = ints;
        }

        int counter = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                counter += matrix[row][col];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(counter);
    }
}
