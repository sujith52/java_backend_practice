package july1;

import java.util.Scanner;

/*10. Banking Balance
Declare a constant interest rate using final. Take principal amount from the user.
 Calculate simple interest for 2 years.

Formula:

SI = (P × R × T) / 100 */
public class que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount my user :");
        Integer amount = sc.nextInt();
        final double rate = 3.0;
        Integer time = 2;
        Double SI = (amount * rate * time) / 100;
        System.out.println("the simple intrest is "+ SI);
    }
}
