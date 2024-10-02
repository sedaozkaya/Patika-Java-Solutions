
import java.util.Scanner;
public class VATCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the product price:");
        double price = inp.nextDouble();
        if (price < 0) {
            System.out.println("Invalid input.");
        } else if (price <= 1000) {
            {
                System.out.println("Price without VAT: " + price);
                System.out.println("VAT Rate: 18%");
                System.out.println("VAT Amount: " + price * 0.18);
                System.out.println("Price with VAT: " + price * 1.18);
            }

        }
        else {
            System.out.println("Price without VAT: " + price);
            System.out.println("VAT Rate: 8%");
            System.out.println("VAT Amount: " + price * 0.08);
            System.out.println("Price with VAT: " + price * 1.08);
        }
    }
}
