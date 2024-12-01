import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number");
        int n = inp.nextInt();
        System.out.println(check(n));
    }
    public static String check(int number){
        int sum = 0;
        String perfect = number +" is a perfect number";
        String notPerfect = number + " is not a perfect number";
        for (int i = 1 ; i< number ; i++){
            if (number % i ==0)
                sum += i;
        }
        if (sum == number)
            return perfect;
        else{
            return notPerfect;
        }

    }
}
