
interface A{
    void show();
    void inthis();
}
// class - class = extends
//class - interface = implements
// interface to interface = extends 
class B implements A,Y{

   
    public void inthis() {
        System.out.println("This inside the inthis metod ");
        
    }
    public void show() {
        System.out.println("This is inside the show method ");
        
    }
    public void runn(){
        System.out.println("This is from the thinggs ");
    }
    
}

interface X{
    void runn();
}
interface Y extends X{
    
}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.inthis();

        Y obj1 = new B();
        obj1.runn();
    }
    
}