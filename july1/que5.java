package july1;

import java.util.Scanner;

/*
6. String Analyzer
Write a program that:

Accepts a full name.
Prints:
Length of the name
First character
Last character
First 3 characters
Last 3 characters */
public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given string bro :");
        String name = sc.nextLine();
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        Integer last = name.length() - 1;
        System.out.println(name.charAt(last));
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(name.length()-3,name.length()));
    }
}
