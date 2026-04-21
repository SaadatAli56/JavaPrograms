package Lab_Week_04;

public class MatrixOperations {

        // 1. Add two matrices
        public int[][] add(int[][] a, int[][] b) {
            int rows = a.length;
            int cols = a[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            return result;
        }

        // 2. Subtract two matrices
        public int[][] subtract(int[][] a, int[][] b) {
            int rows = a.length;
            int cols = a[0].length;
            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }
            return result;
        }

        // 3. Transpose a matrix (Rows become columns)
        public int[][] transpose(int[][] a) {
            int rows = a.length;
            int cols = a[0].length;
            int[][] result = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[j][i] = a[i][j];
                }
            }
            return result;
        }

        // 4. Check if symmetric (Matrix must be equal to its transpose)
        public boolean isSymmetric(int[][] a) {
            int rows = a.length;
            int cols = a[0].length;

            if (rows != cols) return false; // Must be square

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (a[i][j] != a[j][i]) return false;
                }
            }
            return true;
        }

        // 5. Sum of diagonal elements
        public int sumDiagonal(int[][] a) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][i]; // Elements where row index == column index
            }
            return sum;
        }

        // Helper method to print matrix
        public void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            MatrixOperations op = new MatrixOperations();
            int[][] m1 = {{1, 2}, {2, 1}};
            int[][] m2 = {{3, 4}, {5, 6}};

            System.out.println("Addition:");
            op.printMatrix(op.add(m1, m2));

            System.out.println("Transpose of M2:");
            op.printMatrix(op.transpose(m2));

            System.out.println("Is M1 Symmetric? " + op.isSymmetric(m1));
            System.out.println("Diagonal Sum of M2: " + op.sumDiagonal(m2));
        }
}
