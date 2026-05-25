import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        q1
        String name = "Sujith Kumar Yadav Gavathakatla";
        int age = 21;
        float percentage = 70.23f;
        char grade = 'A';
        System.out.println(name +"\n"+age+ "\n"+percentage+"\n"+grade+"\n");

        q2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radus man ! ");
        int num = sc.nextInt();
        float pi = 3.14f;
        float res = (num * num) * pi;
        System.out.println("The radius is : "+ res );

        q3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer man ! ");
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println("It is the Even number ");
        }else{
            System.out.println("It was odd num");
        }

        q4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int nu1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int nu2 = sc.nextInt();
        System.out.println("Enter num3 :");
        int nu3 = sc.nextInt();

        if (nu1 > nu2)  {
            if (nu1 > nu3) {
                System.out.println("largest was "+ nu2);
            }else{
                System.out.println("the largst " + nu3);
            }
        }
        else  {
            if (nu2 > nu3) {
                System.out.println("largest was "+ nu2);
            }else{
                System.out.println("the largst " + nu3);
            }
        }
        sc.close();

        q5

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int num1  = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int num2  = sc.nextInt();
        System.out.println("Enter the operator +,-,*,/ : ");
        String oper = sc.next();
        switch (oper) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        
            default:
                break;
        }
        

        question 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        for(int i =1; i<= 10;i++){
            System.out.println(num +" x "+i+" x = "+ (num * i));
        }

        q7
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        int sum =0;
        for(int i =0; i<= num; i++){
            sum += i;
        }
        System.out.println("The sum of nums is "+num+ " is  sum is "+sum);


        qes 8

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        int reverse = 0;
        while (num != 0) {
            int lastdigit = num % 10;
            reverse = (reverse * 10) + lastdigit;
            num /= 10; 
        }
        System.out.println(reverse);

        qes 9
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        long num = sc.nextLong();
        
        if (num == 0) {
            System.out.println("the digit is 1 ");
        } else {
            int count = 0;
            long temp = Math.abs(num);
            while (temp > 0) {
                temp /= 10;
                count++;
                
            }
            System.out.println("digit count "+ count);
        }

        // qes 10 

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        
        int tem = num;
        int rever = 0;

        while (tem > 0) {
            int digit = tem % 10;
            rever = (rever * 10) + digit;
            tem /= 10;
        }
        if (num == rever) {
            System.out.println("palins ");
        } else{
            System.out.println("not planis ");
        }

        //qes 11

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        
        long fact = 1;
        for(int i =1; i<= num; i++){
            fact *= i;
        }
        System.out.println("fact is "+ fact);
    }
}
