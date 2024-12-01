import java.util.Scanner;

public class AverageOfMultiples {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number");
        int n = inp.nextInt();
        System.out.println("the average of multiples of 3 and 4 is " + average(n));

    }
public static double average(int n){
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        return (double) sum /count;
}
}
