package july1;

import java.util.Scanner;

/*12. String Manipulation Challenge
Accept a sentence from the user and print:

Total length
First character
Last character
First word
Last word
Middle character
First half
Second half */
public class que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string vale bro !");
        String name = sc.nextLine();
        System.out.println("the length os stringd "+ name.length());
        System.out.println("first is "+name.charAt(0));
        System.out.println("last is "+ name.charAt(name.length()-1) );
        System.out.println("middle is "+ name.charAt(name.length()/2) );
        System.out.println("first half is "+ name.substring(0,name.length()/2));
        System.out.println("second  half is "+ name.substring(name.length()/2, name.length()));

        String[] words = name.split("");
        System.out.println("the first word is "+words[0]);
        System.out.println("the last one si "+words[name.length()-1]);


    }
}
