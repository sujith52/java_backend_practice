package july1;
/*13. Data Type Demonstration
Create one variable of every primitive data type. Print:

Value
Size in bytes (hardcode the sizes)
Explain why each data type was chosen in comments. */
public class que13 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 20000;
        long l = 563768132l;
        double d = 5694275.3655d;
        float f = 8964378.3679f;
        int i = 568333;
        char c = 'A';
        boolean boll = true;

        System.out.println(Byte.SIZE);
        System.out.println(Float.MIN_VALUE + " TO "+ Float.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " TO "+ Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " TO "+ Short.MAX_VALUE);
        System.out.println(Character.MIN_VALUE + " TO "+ Character.MAX_VALUE);
        System.out.println();

    }
}
