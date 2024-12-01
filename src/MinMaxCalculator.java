import java.util.Scanner;

public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int n = inp.nextInt();
        minMax(n);

        }

    public static void minMax(int n){
        Scanner inp = new Scanner(System.in);
        int min = 0;
        int max = 0;
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter a number:");
            int num = inp.nextInt();
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }


}




