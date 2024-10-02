import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the length of side " + (i + 1) + ":");
            sides[i] = inp.nextDouble(); // Storing each side in the array
        }

        double side1 = sides[0];
        double side2 = sides[1];
        double side3 = sides[2];


        double u = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));
        System.out.println("Area of the triangle: " + area); // Area of triengle print




    }
}
