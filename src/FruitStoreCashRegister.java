import java.util.Scanner;

public class FruitStoreCashRegister {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;


        double kiloPear = getInput("How many kilos of Pear?");
        double kiloApple = getInput("How many kilos of Apple?");
        double kiloTomato = getInput("How many kilos of Tomato?");
        double kiloBanana = getInput("How many kilos of Banana?");
        double kiloEggplant = getInput("How many kilos of Eggplant?");

        // Calculate total amount
        double totalAmount = (kiloPear * pear) + (kiloApple * apple) +
                (kiloTomato * tomato) + (kiloBanana * banana) +
                (kiloEggplant * eggplant);

        // Output the total amount
        System.out.printf("Total Amount: %.2f TL\n", totalAmount);
    }
    private static double getInput(String message) {
        Scanner inp = new Scanner(System.in);
        double kilos;

        while (true) {
            System.out.println(message);
            kilos = inp.nextDouble();


            if (kilos >= 0) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a non-negative value.");
            }
        }
        return kilos;
    }
}
