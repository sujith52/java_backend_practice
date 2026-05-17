
class A{
    public void show1(){
        System.out.println("this is show 1 from A class");
    }
}
class B extends A{
    public void show2(){
        System.out.println("this is the class B show 2");
    }
}

public class Casting {
    public static void main(String[] args) {
        double num = 63.23;
        int num1 = (int) num;
        System.out.println(num1);

        float sums = 63.568f;
        double nusm = (double) sums;
        System.out.println(nusm);

        A obj1 = new B();
        obj1.show1();

        B obj2 = (B) obj1;
        obj2.show2();
    }
}
