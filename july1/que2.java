package july1;

import java.util.Scanner;

/*
2. Type Conversion Calculator
Write a program that:

Takes an integer as input.
Implicitly converts it into double.
Explicitly converts the double back into int.
Print all three values. */
public class que2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num ");
        Integer num = sc.nextInt();

        double value = (double) num;
        System.out.println(value);

        Integer num1 = (Integer) num;
        System.out.println(num1);
    }
}
