import java.util.Scanner;

public class EvenAndMultiplesOfFourSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int m;

        do {
            System.out.print("Enter a number: ");
            m = inp.nextInt();

            if (m % 4 == 0) {
                sum += m;
            }
        } while (m % 2 == 0);

        System.out.println("The sum of the multiples of 4 is: " + sum);
    }
}

