package july1;

import java.util.Scanner;

/*3. Arithmetic Calculator
Write a Java program that:

Accepts two integers.
Performs addition, subtraction, multiplication, division, and modulus.
Display the results. */
public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        Integer num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        Integer num2 = sc.nextInt();

        System.out.println("addition is " +(num1 + num2));
        System.out.println("subtraction  is " + (num1 - num2));
        System.out.println("multiplictaion  is " +num1 * num2);
        System.out.println("divison is " +num1 / num2);
        System.out.println("modulus  is " +num1 % num2);
    }
    
}
