import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            int[] ints = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = ints;
        }

        int row = 0;
        int col = 0;

        while (row < n && col < n) {
            System.out.print(matrix[row++][col++] + " ");
        }

        row = n - 1;
        col = 0;

        System.out.println();

        while(row >= 0 && col < n) {
            System.out.print(matrix[row--][col++] + " ");

        }

    }
}
