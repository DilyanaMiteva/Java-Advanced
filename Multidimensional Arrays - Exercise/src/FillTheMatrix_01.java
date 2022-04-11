import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int n = Integer.parseInt(input[0]);
        String fillPattern = input[1];

        int[][] matrix = fillMatrix(n, fillPattern);
        printMatrix(matrix);

    }

    private static int[][] fillMatrix(int n,String fillPattern) {
        int[][] matrix = new int[n][n];
        int number = 1;
        if (fillPattern.equals("A")){
            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = number++;
                }
            }
        } else if (fillPattern.equals("B")) {
            for (int col = 0; col < matrix.length; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < matrix[col].length; row++) {
                        matrix[row][col] = number++;
                    }
                } else {
                    for (int row = matrix[col].length - 1; row >= 0 ; row--) {
                        matrix[row][col] = number++;
                    }
                }
            }
        }
        return matrix;
    }


    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }


}

