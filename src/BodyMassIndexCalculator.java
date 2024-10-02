import java.util.Scanner;
public class BodyMassIndexCalculator {
    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your height (in meters):");
        double h= inp.nextDouble();
        if (h<0){
            System.out.println("invalid input");
    }
        else {
            System.out.println("Please enter your weight:");
            double m= inp.nextDouble();
            if (m<0){
                System.out.println("invalid input");
            }
            else {

                System.out.println("Your Body Mass Index " + m / Math.pow(h,2));
            }
        }
}}
