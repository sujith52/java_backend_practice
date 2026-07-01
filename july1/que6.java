package july1;

import java.util.Scanner;

/*7. Employee Salary Increment
Write a Java program that:

Accepts employee name and salary.
Increase salary by 10% using assignment operators.
Print old salary and new salary. */
public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name bro :");
        String name = sc.nextLine();
        System.out.println("Enter the employee salery bro :");
        double salary = sc.nextDouble();

        System.out.println("The old salary of  "+name +" is : "+ salary);
        salary += (salary * 0.10);

        System.out.println("the newest salary was "+ salary);


    }
}
