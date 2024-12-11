public class ArrayAverageHarmonic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        double average = 0;
        double sum = 0;
        for ( int i = 0; i < arr.length;i++){
        sum = sum + (1.0 /arr[i]);

        }
        average = arr.length / sum;
        System.out.println(average);
    }
}
