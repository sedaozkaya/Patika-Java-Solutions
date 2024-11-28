import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int year = imput.nextInt();
        System.out.println("Your Chinese zodiac sign is: " + zodiac(year));
    }
    public static String zodiac(int year){
        String array[] = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

              return array[year % 12];
    }


}
