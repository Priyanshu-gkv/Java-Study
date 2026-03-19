import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter your username : ");
        String signUp_name = sc.nextLine();
        System.out.print("Please Enter Your Password : ");
        String signUp_pass = sc.nextLine();
        User user = new User(signUp_name, signUp_pass);
        if (!(user.isPassContains(signUp_pass))) {
            System.out.println(
                    "Your password must contains some special character, at least one uppercase letter and some numeric value.");
        } else {

            System.out.print("Re-enter your Password : ");
            String pass_Recheck = sc.nextLine();

            if (!(Objects.equals(signUp_pass, pass_Recheck))) {
                System.out.println("Password doesn't match");
            }
            System.out.println("Enter 'forgot password' to Reset Password.(if you want otherwise Enter.)");
            String reset_pass = sc.nextLine();
            if (Objects.equals(reset_pass.toLowerCase(), "forgot password")) {
                System.out.print("Enter Your new Password : ");
                String newPassword = sc.nextLine();
                user.resetPassword(newPassword);

                System.out.println("Your Password has reset.");
            } else {
                System.out.println("Your Data Saved.");
                System.out.println("Please login with your Credentials.");

                System.out.print("Please Enter your username : ");
                String name = sc.nextLine();
                System.out.print("Please Enter your Password : ");
                String pass = sc.nextLine();

                if (user.userCheck(name, pass)) {
                    System.out.println("Congratulations on your login.");

                } else {
                    System.out.println("Invalid username or Password.");
                }
            }
        }

    }

}

class User {

    private final String name;
    private String pass;

    // String[] specialCharacter = { "@", "#", "$", "%", "^", "&", "*", "!", "~" };

    User(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    String resetPassword(String pass) {
        this.pass = pass;
        return this.pass;
    }

    boolean isPassContains(String pass) {
        // for (int i = 0; i < specialCharacter.length; i++) {
        // if (pass.contains(specialCharacter[i])) {
        // return true;
        // }
        // }
        // return false;

        return pass != null && pass.matches(".*[~!@#$%^&*()].*") && pass.matches(".*[A-Z].*")
                && pass.matches(".*[0-9].*");
    }

    // boolean isPassContainsAtLeastOneUpperCase(String pass) {
    // return pass != null && );
    // }

    boolean userCheck(String name, String pass) {
        return Objects.equals(name, this.name) && Objects.equals(pass, this.pass);
    }

}
