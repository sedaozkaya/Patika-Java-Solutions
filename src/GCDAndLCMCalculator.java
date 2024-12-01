import java.util.Scanner;

public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = inp.nextInt();
        System.out.println("Enter the second number:");
        int num2 = inp.nextInt();
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm(num1, num2));

    }
    public static int gcd(int num1 , int num2){
        int k= Math.max(num1,num2);
        while (k>1 ){

            if (num1 % k ==0 && num2 % k ==0)
                break;
            k--;
        }
        return k;
    }
    public static int lcm(int num1 , int num2){
        return num1 * num2 / gcd(num1,num2);
    }
}
