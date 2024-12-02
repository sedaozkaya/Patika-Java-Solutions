import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = inp.nextInt();
        if (isPalindrom(num))
            System.out.println("palindrom");
        else {
            System.out.println("not palindrom");
        }


    }
    public static boolean isPalindrom(int n){
        String num_str = String.valueOf(n);
        int length = num_str.length();
        int k = length/2;
        for (int i = 1 ; i < k ; i++){
            if (num_str.charAt(i) != num_str.charAt(length-i-1))
                return false;
        }
        return true;
    }
}
