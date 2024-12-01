import java.util.Scanner;

public class ExponentiationCalculato {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("base: ");
        int a = inp.nextInt();
        System.out.println("exponent: ");
        int n = inp.nextInt();
        if (n < 0){
            System.out.println("exponent must be greater than or equal to 0");
        } else {
            System.out.println("result: " + calculator(a, n));
        }
    }
public static int calculator(int a , int n){
        int result = 1;
        for (int i = 0 ; i < n ; i++){
            result *= a;
        }
        return result;
}
}
