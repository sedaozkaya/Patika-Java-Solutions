import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        System.out.println(" The sum of the digits of " + n + " is " + sumOfDigits(n));


    }
    public static int sumOfDigits(int n){
        int length = String.valueOf(n).length();
        double sum = 0;
        for (int i = 0 ; i < length ; i++){
           sum += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));

        }
        return (int) sum;
    }

}
