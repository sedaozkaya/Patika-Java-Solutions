
public class FibonacciSeriesCalculator {


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(  n + ". number: " + fibonacci(n));
    }
}
