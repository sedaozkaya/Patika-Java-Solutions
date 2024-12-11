import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("entered number : ");
        int num = inp.nextInt();

        int [] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (num > arr[arr.length-1]){
                System.out.println("closest lower number: " + arr[arr.length-1]);
                System.out.println("closest greater number: " + "there is no greater number");
                break;
            }
            if (num < arr[0]){
                System.out.println("closest lower number: " + "there is no lower number");
                System.out.println("closest greater number: " + arr[0]);
                break;
            }
            if (arr[i] == num){
                System.out.println("closest lower number: " + arr[i-1]);
                System.out.println("closest greater number: " + arr[i+1]);
                break;
            }
            if (arr[i] > num){
                System.out.println("closest lower number: " + arr[i-1]);
                System.out.println("closest greater number: " + arr[i]);
                break;
            }

        }

    }
}
