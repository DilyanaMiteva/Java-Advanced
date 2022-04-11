import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = array;

        }
        int row = 0;
        int col = 0;

        int sumPrimaryDiagonal = 0;

        while (row < n && col < n) {
            sumPrimaryDiagonal += matrix[row++][col++];
        }

        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            sumSecondaryDiagonal += matrix[i][col - 1 - i];
        }

        int sum = sumPrimaryDiagonal - sumSecondaryDiagonal;
        System.out.println(Math.abs(sum));


    }
}
