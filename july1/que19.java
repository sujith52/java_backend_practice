package july1;

import java.util.Scanner;

/*19. String Formatter
Take a full name.

Generate:

Uppercase initials
Total characters
First name
Last name
Reverse first and last name order
Example:

Input:

Sujith Hemanth
Output:

Initials : SH
Length   : 15
First    : Sujith
Last     : Hemanth
Reverse  : Hemanth Sujith */
public class que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the name with the intials and the name pls");
        String namesd = sc.nextLine();

        String[] namearr = namesd.trim().split("\\s+");

        String first = namearr[0];
        String last = namearr[1];

        char firCap = Character.toUpperCase(first.charAt(0));
        char secondCap = Character.toUpperCase(last.charAt(0));

        int len = namesd.length();
        
        System.out.println(first);
        System.out.println(last);
        System.out.println(firCap);
        System.out.println(secondCap);
        System.out.println("The length is "+ len);
        System.out.println(first.toUpperCase() +" "+ last.toUpperCase());




    }
}
