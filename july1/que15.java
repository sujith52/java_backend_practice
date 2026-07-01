package july1;

import java.util.Scanner;

/*15. Temperature Converter
Accept temperature in Celsius.
Convert into:
Fahrenheit
Kelvin
Use explicit and implicit type casting wherever applicable. */
public class que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp ");
        Double temp = sc.nextDouble();
        Double faren = (temp * 1.8)+32;
        Double kelvin = temp + 273.15;
        System.out.println("the faren heat is "+faren);
        System.out.println("the Kelvin temp is  is "+kelvin);
    }
}
