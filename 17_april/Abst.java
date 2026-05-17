
abstract class Car{
    public abstract void fly();
    public abstract void swim();
    public void drive(){
        System.out.println("It is driving !");
    }

}
abstract class Tata extends Car{
    public abstract void swim();
    public void fly(){
        System.out.println("The car is flying man !");
    }
}
class Something extends Tata{
        public void swim(){
            System.out.println("cars is swimming man !");
        }
}

public class Abst {
    public static void main(String[] args) {
        Car obj = new Something();
        obj.drive();
        obj.fly();
        obj.swim();
    }
}
