import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =inp.nextInt();
        prime(n);
    }
    public static void prime(int num){
        for (int i = 2 ; i <= num; i++){
            int counter = 0;
            for (int j = 1 ; j <= i ; j++){
                if (i % j == 0)
                    counter ++;
            }
            if (counter == 2)
                System.out.printf( "%4d", i );
        }
    }
}
