public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = new int[100];

        // Random sayılarla diziyi dolduruyoruz
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);  // 0 ile 9 arasında rastgele sayılar
        }

        // Frekansları yazdırıyoruz
        printFrequency(arr);
    }

    public static void printFrequency(int[] arr) {
        // Elemanları saymaya başlıyoruz
        for (int i = 0; i < arr.length; i++) {
            int count = 1;  // İlk eleman kendisi sayılır

            // Eğer eleman daha önce sayılmadıysa, frekansını hesapla
            if (arr[i] != -1) {
                // Dizinin geri kalan elemanlarını kontrol ediyoruz
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1;  // Sayılmış elemanı -1 yaparak bir daha sayılmasını engelliyoruz
                    }
                }

                // Eğer bu eleman bulunduysa, frekansını yazdırıyoruz
                if (count > 1) {
                    System.out.println(arr[i] + " found " + count + " times");
                }
            }
        }
    }
}
