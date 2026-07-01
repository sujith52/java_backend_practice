package july1;

import java.util.Scanner;

/*11. Complete Student Report Card
Write a Java program that:

Accepts:
Name
Roll Number
Marks of 5 subjects
Calculate:
Total
Average
Print all details in a professional report format.
Use string concatenation and formatted output. */
public class que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter the rolls ");
        int rolls = sc.nextInt();
        System.out.println("Enter the sub1 ");
        int sub1 = sc.nextInt();
        System.out.println("Enter the sub2 ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the sub3 ");
        int sub3 = sc.nextInt();
        System.out.println("Enter the sub4 ");
        int sub4 = sc.nextInt();
        System.out.println("Enter the sub5 ");
        int sub5 = sc.nextInt();

        System.out.println("the toral marks of "+name+ " is  "+ (sub1+sub2+sub3+sub4+sub5)+" ");
        int avg = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("the average is "+avg);
    }
}
