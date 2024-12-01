import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = input.nextInt();
        System.out.println("The harmonic series of " + n + " is " + harmonic(n));
    }public static double harmonic(int n){
        double result = 0;
        for (int i = 1 ; i <= n ; i++){
            result +=  1.0 /i;
        }
        return result;
    }
}
