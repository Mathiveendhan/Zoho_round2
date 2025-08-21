package Round2_in_zoho_Aug_2025;

import java.util.Arrays;
public class section_2_3Q {
        public static void rotate(int[][] matrix) {
            int n = matrix.length;

            // First loop: swap diagonally across anti-diagonal
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                    matrix[n - 1 - j][n - 1 - i] = temp;
                }
            }

            // Second loop: reverse vertically
            for (int i = 0; i < n / 2; i++) {
                int[] temp = matrix[i];
                matrix[i] = matrix[n - 1 - i];
                matrix[n - 1 - i] = temp;
            }
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println("Original Matrix:");
            printMatrix(matrix);

            rotate(matrix);

            System.out.println("Rotated Matrix (90° Clockwise):");
            printMatrix(matrix);
        }

        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
}
