package july1;

import java.util.Scanner;

/*17. Number Property Checker
Take an integer as input.
Even/Odd
Positive/Negative
Divisible by 5
Divisible by 3
Square of number
Cube of number
Use arithmetic, relational, logical, and ternary operators. */
public class que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber :");
        Integer num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println("It is even ");
        } else{System.out.println("it is odd");}
        
        String pstivnum = (num > 0) ? "positive" : (num < 0) ? "negitive" : "Zero";
        System.out.println("the number is "+ pstivnum);

        String divby3 = ((num %3) == 0) ? "divided by 3 " : "not divd by 3";
        System.out.println("the num is "+divby3);

        String divby5 = (num % 5 == 0) ? "divided by  5" : "not divd by 5";
        System.out.println("the num is "+divby5);

        System.out.println("square of the num is "+(num * num));
        System.out.println("cube of the num is "+(num * num * num ));
    }
}
