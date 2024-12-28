public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18}
        };

        // Check if matrix multiplication is possible
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Resultant matrix will have dimensions (rows of matrix1) x (columns of matrix2)
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Matrix multiplication logic
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
