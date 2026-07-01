

import java.util.Scanner;

/*1. Student Information System
Write a Java program that:

Takes the student's name, age, CGPA, and grade as input using Scanner.
Prints all the details in a formatted way.
Use appropriate data types for each variable. */
public class que1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.nextLine();

        System.out.println("Enter the age bro :");
        Integer age = sc.nextInt();

        System.out.println("Enter the CGPA :");
        double cgpa = sc.nextDouble();

        System.out.println("The student name is "+ name + " age is "+age+" and cgpa is  "+cgpa);
    }
}