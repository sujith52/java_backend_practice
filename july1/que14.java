package july1;

import java.util.Scanner;

/*14. Shopping Bill Generator
Accept:

Customer name
Product name
Quantity
Price per item
Calculate:

Total Price
GST (18%)
Final Bill
Print everything neatly using printf(). */
public class que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer name");
        String name = sc.nextLine();
        System.out.println("product name");
        String product = sc.nextLine();
        System.out.println("Enter the quantity ");
        int qua = sc.nextInt();
        System.out.println("item price ");
        int item = sc.nextInt();
        int total = (qua * item);
        final double  gst = 18.0;
        double gstamount = (total * gst) / 100;
        double finastotal = total + gstamount;
        

        System.out.println("the coustomer "+name +"the product is "+product);
        System.out.println("the total is "+total);
        System.out.println("the gst amount is "+ gstamount);
        System.out.println("with gst is "+ finastotal);
    }
}
