
final class A{
    final public void show(){
        System.out.println("Createdby sujith !");
    }
    public void add(int a, int b){
        System.out.println("The outs is "+(a+b));
    }
}
class B extends A{
    public void show(){
        System.out.println("Createdby sarvajith !");
    }
}
// the final key word makes the class, method, variable to be fully constant !

public class Finals {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.add(5, 6);

        final int age = 11;
        age = 45;
        System.out.println("This will give us the eroor man !");
    }
}
