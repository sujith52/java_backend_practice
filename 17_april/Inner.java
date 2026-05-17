

class A{
    int age;
    public void show(){
        System.out.println("This is the show mwthod man !");
    }
    static class B{
        public void sowed(){
            System.out.println("This will be inside the class A and class B");
        }
    }
}


public class Inner {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        // A.B obj2 = obj1.new B();
        A.B obj2 = new A.B();
        obj2.sowed();
    }
}
