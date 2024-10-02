import java.util.Scanner;


public class TaximeterCalculator {
    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
        System.out.println("Enter the km:");
double km = inp.nextDouble();
double price= (km*2.20)+10;
double total_price;
if(price<20){
    total_price=20;
}
else {
     total_price=price;
}
        System.out.println("total price is:" + total_price);
        System.out.println("total price integer is:" + (int)total_price);













    }
}
