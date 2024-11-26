import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validPassword = "abcde123";
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.println("Enter the password:");
            String userPassword = input.nextLine();

            if (userPassword.equals(validPassword)) {
                System.out.println("Login successful!");
                isAuthenticated = true;
                System.out.println("Password is wrong. Do you want to reset the password?");
                System.out.println("Type 1 for Yes or 0 for No:");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == 1) {
                    resetPassword(input, validPassword);
                } else {
                    System.out.println("Please try again.");
                }
            }
        }
    }

    public static void resetPassword(Scanner input, String oldPassword) {
        boolean passwordReset = false;

        while (!passwordReset) {
            System.out.println("Enter a new password:");
            String newPassword = input.nextLine();

            if (newPassword.equals(oldPassword)) {
                System.out.println("The password could not be created, please enter a different one.");
            } else {
                System.out.println("The password has been created.");
                passwordReset = true;
            }
        }
    }
}
