import java.util.Scanner;

public class RecursiveExponentiation {

    public static void main(String[] args) {
        exponent();
    }

    public static void exponent() {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = inp.nextInt();

        System.out.println("Enter the exponent: ");
        int exp = inp.nextInt();


        int result = power(base, exp);
        System.out.println("Result: " + result);


        exponent();
    }


    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }
}
