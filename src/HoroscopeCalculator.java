import java.util.Scanner;

public class HoroscopeCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your birth month:");
        int month = inp.nextInt();
        System.out.println("Enter your birth day:");
        int day = inp.nextInt();
        if (month<1 || month>12 || day<1 || day>31){
            System.out.println("Invalid date");
    }
        System.out.println("Your horoscope is: " + horoscope(month, day));
        ;}
    public static String horoscope(int month , int day){
switch (month){
    case 1:
        if (day<21){
            return "Capricorn";
        }else{
            return "Aquarius";
        }
case 2:
    if (day<19){
        return "Aquarius";
    }else{
        return "Pisces";
    }
case 3:
    if (day<21){
        return "Pisces";
    }else{
        return "Aries";
    }
case 4:
    if (day<21){
        return "Aries";
    }else{
        return "Taurus";
    }
case 5:
    if (day<22){
        return "Taurus";
    }else{
        return "Gemini";
    }
case 6:
    if (day<22){
        return "Gemini";
    }else{
        return "Cancer";
    }
case 7:
    if (day<23){
        return "Cancer";
    }else{
        return "Leo";
    }
case 8:
    if (day<24){
        return "Leo";
    }else{
        return "Virgo";
    }
case 9:
    if (day<24){
        return "Virgo";
    }else{
        return "Libra";
    }
case 10:
    if (day<24){
        return "Libra";
    }else{
        return "Scorpio";
    }
case 11:
    if (day<23){
        return "Scorpio";
    }else{
        return "Sagittarius";
    }
case 12:
    if (day<22){
        return "Sagittarius";
    }else{
        return "Capricorn";
    }
default:
    return "Invalid month";
}
    }
}