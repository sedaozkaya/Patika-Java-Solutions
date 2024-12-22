import java.util.Scanner;

public class MineSweeper {
    static int numberOfMines = 1;
    static int rows, cols;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter size of board:");
            rows = scanner.nextInt();
            cols = scanner.nextInt();
            if (rows > 2 && cols > 2) {
                break;
            }
            System.out.println("Rows and cols should be greater than 2.");
        }
        String[][] gameBoard = createArray(rows, cols);
        String[][] newArr = locationMines(rows, cols, gameBoard);
        game(newArr);
    }

    public static String[][] createArray(int rows, int cols) {
        String[][] array = new String[rows + 2][cols + 2];

        for (int i = 0; i < rows + 2; i++) {
            for (int j = 0; j < cols + 2; j++) {
                array[i][j] = "-";
            }
        }
        return array;
    }

    public static String[][] locationMines(int rows, int cols, String[][] array) {
        numberOfMines = rows * cols / 4;
        for (int i = 0; i < numberOfMines; i++) {
            int row, col;
            do {
                row = (int) (Math.random() * rows) + 1;
                col = (int) (Math.random() * cols) + 1;
            } while (array[row][col].equals("*"));
            array[row][col] = "*";
        }
        return array;
    }

    public static void game(String[][] array) {
        int remainingCells = rows * cols - numberOfMines;
        boolean[][] revealed = new boolean[rows + 2][cols + 2];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Current Board:");
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    if (revealed[i][j]) {
                        System.out.print(array[i][j] + " ");
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println();
            }

            System.out.print("Enter row and column: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 1 || row > rows || col < 1 || col > cols) {
                System.out.println("Invalid coordinates. Try again.");
                continue;
            }

            if (revealed[row][col]) {
                System.out.println("This cell is already revealed. Choose another.");
                continue;
            }

            revealed[row][col] = true;

            if (array[row][col].equals("*")) {
                System.out.println("Game Over! You hit a mine.");
                break;
            }

            int counter = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (array[row + i][col + j].equals("*")) {
                        counter++;
                    }
                }
            }

            array[row][col] = String.valueOf(counter);
            remainingCells--;

            if (remainingCells == 0) {
                System.out.println("Congratulations! You cleared the board!");
                break;
            }
        }
    }
}
