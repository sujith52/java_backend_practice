
abstract class A{
    public void show(){
        System.out.println("The whole new things !in a class");
    }
    public abstract void fly();
}
// anonamous class 

public class Anony {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Thois is inside the new method man ! new thoughts !");
            }
            public void fly(){
                System.out.println("This will be the output");
            }
        };
        obj.show();
        obj.fly();
    }
}
