
class SujithException extends Exception
{
    public SujithException(String  str){
        super(str);
    }
}

class A{
    public void show() throws ClassNotFoundException{
            Class.forName("Temo");
        
    }
}


public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(Exception e){
            System.out.println(e);
        }

        

        int i = 20;
        int j = 0;
        int nums[] = new int[4];

        try{
            j = 18/i;
                if(j == 0)
                    throw new SujithException("the value is printing zero ");
            System.out.println(nums[2]);
            System.out.println(nums[4]);
        }
        catch(ArithmeticException ae){
            System.out.println("The eroor is in the numbers man ! "+ ae);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array error "+ a);
        }
        catch(Exception E){
            System.out.println("Something has went wrong man !"+ E);
        }
        System.out.println(j);
        System.out.println("It was working !");
    }
}