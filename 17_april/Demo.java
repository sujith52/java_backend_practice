// this problem mainly explains the dynamic method dispatch 
class A{
    public void show(){
        System.out.println("This is the class A method !");
    }
}
class B extends A{
    public void show(){
        System.out.println("This is the B method !");
    }
}
class C extends A{
    public void show(){
        System.out.println("This is the C method !");
    }
}



public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
