import java.util.Scanner;

public class AirplaneTicketCalculator {
    public static void main(String[] args) {
        //Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the distance:");
        int distance = input.nextInt();
        if (distance < 0) {
            System.out.println("invalid data");
            return;
        }
        System.out.println("enter your age:");
        int age = input.nextInt();
        if (age < 0) {
            System.out.println("invalid data");
            return;
        }
        System.out.println("enter the type of the trip:");
        System.out.println("1 for one way, 2 for round trip");
        int tripType = input.nextInt();
        if (tripType != 1 && tripType != 2) {
            System.out.println("invalid data");
            return;
        }
        System.out.println(calculator(distance,age,tripType));

    }
    public static double calculator(int km, int age, int type){
        double price = km * 0.10;
        if (age < 12){
           price = price/2;
        }
        else if (age<25 ){
            price = price - (price*0.10);
        }
        else if (age > 65){
            price = price - (price * 0.30);
        }

        if (type == 2){
            price = 2*(price*0.80);
        }
        return price;

    }
}
