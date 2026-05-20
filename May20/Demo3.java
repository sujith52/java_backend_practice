// threads concept is going to start man !

class A implements Runnable
{
    public void run(){
        for(int i = 1; i<= 5; i++){
            System.out.println("Hi sreeja ");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable
{
    public void run(){
        for(int i = 1; i<=5;i++){
            System.out.println("Hi latha ");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class Demo3 {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
        for(int i = 1; i<= 5; i++){
            System.out.println("Hi sreeja ");
            try {Thread.sleep(10);} catch (Exception e) {e.printStackTrace();}
        }};
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        
       
    }
}
