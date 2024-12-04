import java.util.Scanner;

public class RecursivePrimeNumber {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı Giriniz: ");
            int num = inp.nextInt();

            if (isPrime(num, 2)) {
                System.out.println(num + " sayısı ASALDIR!");
            } else {
                System.out.println(num + " sayısı ASAL değildir!");
            }
        }
    }


    public static boolean isPrime(int num, int divisor) {
        if (num < 2) {
            return false;
        }
        if (divisor == num) {
            return true;
        }
        if (num % divisor == 0) {
            return false; 
        }
        return isPrime(num, divisor + 1);
    }
}
