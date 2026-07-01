package july1;

import java.util.Scanner;

/*16. Mini Login System
Declare:
final String USERNAME = "admin";
final String PASSWORD = "java123";
Take username and password from the user.
Login Successful
Login Failed
Note: Use String comparison properly. */
public class que16 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "java123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username :");
        String user = sc.nextLine();
        System.out.println("Enter the password :");
        String password = sc.nextLine();

        if (user.equals(USERNAME)&& password.equals(PASSWORD) ) {
            System.out.println("The login was sucessful ");
        } else {System.out.println("The login was not sucessfull ");}
    }
}
