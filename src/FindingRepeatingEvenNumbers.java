public class FindingRepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] arr = createArray();
        findRepeatingNumber(arr);
    }

    public static int[] createArray() {
        int[] arr = new int[500];
        for (int i = 0; i < 500; i++) {
            arr[i] = (int) (Math.random() * 100);  // 0 ile 99 arasında rastgele sayılar
        }
        return arr;
    }

    public static void findRepeatingNumber(int[] arr) {
        int count = 0;
        int[] repeatingNumbers = new int[250]; // Max 250 çift sayı olabilir
        int[] evenNumbers = new int[250]; // Çift sayıları tutacağımız dizi

        // Çift sayıları dizide topluyoruz
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers[count] = arr[i];
                count++;
            }
        }

        // Tekrar eden çift sayıları buluyoruz
        for (int i = 0; i < count; i++) {
            int num = evenNumbers[i];
            boolean isRepeated = false;

            // Aynı sayıyı daha önce görüp görmediğimizi kontrol ediyoruz
            for (int j = i + 1; j < count; j++) {
                if (evenNumbers[j] == num) {
                    isRepeated = true;
                    break; // Eğer tekrar eden sayıyı bulduysak, döngüden çıkıyoruz
                }
            }

            // Eğer sayıyı daha önce görmediysek ve tekrar ettiyse yazdırıyoruz
            if (isRepeated) {
                System.out.println(num);

                // Bu sayıyı tekrar kontrol etmemek için, tekrarını engelliyoruz
                for (int k = i + 1; k < count; k++) {
                    if (evenNumbers[k] == num) {
                        evenNumbers[k] = -1; // Sayıyı -1 ile işaretleyerek tekrarını engelliyoruz
                    }
                }
            }
        }
    }
}
