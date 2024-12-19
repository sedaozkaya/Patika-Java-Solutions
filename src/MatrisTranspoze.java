import java.util.Scanner;

public class MatrisTranspoze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int row = input.nextInt();
        int column  = input.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose the matrix
        transpoze(matrix, row, column);
    }

    public static void transpoze(int[][] matrix, int row, int col) {
        int[][] transpose = new int[col][row]; // Create a transpose matrix

        // Perform the transpose
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
