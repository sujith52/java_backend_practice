package july1;
/*
4. Even or Odd Checker
Write a Java program that:

Accepts an integer.
Uses the ternary operator to print whether the number is Even or Odd. */

import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        Integer age = sc.nextInt();

        if(age > 18){
            System.out.println("Your "+ age +" is elegible bro ");
        } else {
            System.out.println("Your age doesnt elegible ");
        }
    }
}
