package july1;

import java.util.Scanner;

/*9. Character Information
Write a Java program that:

Takes a character as input.
Prints the character and its ASCII value using type casting. */
public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the char chara enter bro ");
        Character chars = sc.next().charAt(0);
        int value = (int) chars;
        System.out.println("The ACSS value of char is "+ value);
    }
}
