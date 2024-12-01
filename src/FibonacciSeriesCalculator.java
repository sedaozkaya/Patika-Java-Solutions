import java.util.Scanner;

public class FibonacciSeriesCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the number ıf elements: ");
        int n = inp.nextInt();
        fibonacci(n);

    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}