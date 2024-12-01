import java.util.Scanner;

public class InvertedTriangleDrawer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = inp.nextInt();
        triangle(n);
    }
    public static void triangle(int n){
        for (int i = 2 * n - 1; i > 0; i -= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}}
