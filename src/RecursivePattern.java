
import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Pattern:");
        recursivePattern(n, n, false);
    }

    public static int recursivePattern(int current, int original, boolean isIncreasing) {
        System.out.print(current + " ");

        if (current <= 0) {
            isIncreasing = true; // Negatife ulaşıldığında artışa geç
        }

        if (current == original && isIncreasing) {
            return current; // Orijinal sayıya dönüldüğünde dur
        }

        if (!isIncreasing) {
            return recursivePattern(current - 5, original, false); // Azaltma aşaması
        } else {
            return recursivePattern(current + 5, original, true); // Artış aşaması
        }
    }
}
