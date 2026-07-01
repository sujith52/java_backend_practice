package july1;

import java.util.Scanner;

/*
8. Rectangle Calculator
Write a Java program that:

Takes length and width as input.
Calculate:
Area
Perimeter
Print the results. */
public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectagele ");
        Integer length = sc.nextInt();
        System.out.println("Enter the length of rectagele ");
        Integer  width = sc.nextInt();
        Integer area = length * width;
        Integer permeter = 2*(length + width);
        System.out.println("The area  is "+area+" and teh perimete is "+permeter);

    }
}
