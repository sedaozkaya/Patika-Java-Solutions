import  java.util.Scanner;
public class AreaOfCircleCalculator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double pi=3.14;
        System.out.println("r:");
        double r= inp.nextDouble();
        if (r<0){
            System.out.println("invalid input");}

        else {System.out.println("a:");
            int a= inp.nextInt();


if (a<0){
    System.out.println("invalid input");
}
 else{  double area = (pi*Math.pow(r,2)*a)/360;
        System.out.println("area:" + area);}

    }}}

