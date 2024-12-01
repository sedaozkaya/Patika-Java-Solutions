import java.util.Scanner;

public class PrintPowersOfFourAndFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = input.nextInt();
        powers(n);
    }
    public static void powers(int n){
        for (int i = 0 ; i <= n ; i++){
            System.out.println("4^" + i + " = " + (int)Math.pow(4,i));
            System.out.println("5^" + i + " = " + (int)Math.pow(5,i));
        }
    }
}
