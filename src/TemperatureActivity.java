import java.util.Scanner;

public class TemperatureActivity {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature:");
    int temp = input.nextInt();
    if (temp < 5) {
        System.out.println("Ski");
    } else if ( temp < 15) {
        System.out.println("Cinema");
    } else if ( temp < 25) {
        System.out.println("Picnic");
    } else {
        System.out.println("Swimming");
    }
}}
