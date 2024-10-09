import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number1:");
        double number1= inp.nextDouble();
        System.out.println("Enter number2:");
        double number2= inp.nextDouble();
        System.out.println("+ = addition" +
                "- = subtraction" +
                "* = multiplication" +
                "/ = division");
        System.out.println("Enter the operation:");
        char select = inp.next().charAt(0);
        if (select == '+') {
            System.out.println("Result:" + (number1 + number2));
        } else if (select == '-') {
            System.out.println("Result:" + (number1 - number2));
        } else if (select == '*') {
            System.out.println("Result:" + (number1 * number2));
        } else if (select == '/') {
            if (number2 == 0) {
                System.out.println("Invalid input");
            } else {
                System.out.println("Result:" + (number1 / number2));
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
