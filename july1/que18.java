package july1;

import java.util.Scanner;

/*18. Personal Profile Generator
Take input:

Name
Age
Height
Weight
Gender (char)
Married (boolean)
Print the details in a professional profile format.
Use:
Scanner
String concatenation
printf()
Comments */
public class que18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name pls ");
        String name = sc.nextLine();

        System.out.println("Enter the age pls ");
        int  age  = sc.nextInt();

        System.out.println("Enter the height pls ");
        Double hei = sc.nextDouble();

        System.out.println("Enter the weight pls ");
        Double weight = sc.nextDouble();

        System.out.println("Enter the Gender pls ");
        char gender = sc.next().charAt(0);

        System.out.println("the name is "+name+" and the age is "+age+ " teh hei "+hei+" weidth is "+weight+" the gender is "+gender+" .");
    }
}
