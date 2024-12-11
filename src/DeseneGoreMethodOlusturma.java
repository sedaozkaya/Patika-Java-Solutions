import java.util.Scanner;
    public class DeseneGoreMethodOlusturma {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = inp.nextInt();
            method(number, number, false); // İlk çağrıda orijinal sayıyı kaydetmek için ikinci parametre eklenir
        }

        public static void method(int num, int original, boolean isIncreasing) {
            // Sayıyı yazdır
            System.out.println(num);

            // Base case: Eğer sayı başlangıç değerine ve artış moduna geri dönerse
            if (num == original && isIncreasing) {
                return;
            }

            // Eğer sayı negatif veya 0 ise artık artış moduna geçiyoruz
            if (num <= 0) {
                isIncreasing = true;
            }

            // Rekürsif olarak bir sonraki adıma geç
            if (isIncreasing) {
                method(num + 5, original, true);
            } else {
                method(num - 5, original, false);
            }
        }
    }
