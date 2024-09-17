import java.util.Scanner;
public class GradeAverageCalculator {
    public static void main(String[] args) {
        String[] subjects = {"Mathematics", "Physics", "Chemistry", "Biology", "History", "Geography"};
   int[] grades= new int[subjects.length];
   Scanner inp = new Scanner(System.in);

   for (int i=0 ; i<subjects.length; i++){
       int grade;
       while (true){
           System.out.println(subjects[i] + ":");
           grade= inp.nextInt();
           if (grade>=0 && grade <=100){
               break;
           }
           else{
               System.out.println("Error: Please enter a grade between 0 and 100.");

           }
       }
       grades[i] = grade;
   }
int total =0;
   for (int grade: grades){
       total += grade;
   }
        double average = total / (double) grades.length;

        System.out.println("Grade Point Average: " + average);
        if (average > 60) {
            System.out.println("Passed the Class");
        } else {
            System.out.println("Failed the Class");
        }

    }
}