import java.util.Scanner;

public class PassingStatus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your math grade.");
        int math = input.nextInt();
        math = isInvalid(math);
        System.out.println("Enter your pyhsics grade.");
        int pyhsics = input.nextInt();
        pyhsics = isInvalid(pyhsics);
        System.out.println("Enter your literature grade.");
        int literature = input.nextInt();
        literature = isInvalid(literature);
        System.out.println("Enter your chemistry grade.");
        int chemistry = input.nextInt();
        chemistry = isInvalid(chemistry);
        System.out.println("Enter your music grade.");
        int music = input.nextInt();
        music = isInvalid(music);
        int total = math + pyhsics + literature + chemistry + music;
        double average = total / 5;
        if (average >= 55) {
            System.out.println("You passed the class. Your average is " + average);
        } else {
            System.out.println("You failed the class. Your average is " + average);
        }
    }
    public static int isInvalid(int k){
        if (k<0 || k>100){
            System.out.println("invalid score. enter again");
            Scanner inp2 = new Scanner(System.in);
            k = inp2.nextInt();
            isInvalid(k);
        } 
        return k;
    }
}
