
// LVTI - local variable type inference , mostly tals on the var key word and definig new object with var
//sealed classes 

// sealed class A permits B,C{

// }

// final class B extends A{

// }
// non-sealed class C extends A{

// }
// class D{

// }


record Alien(int id, String name){}

public class Demo6 {
    public static void main(String[] args) {
        Alien a1 = new Alien(4, "Sujith");
        Alien a2 = new Alien(2, "sreej");
        Alien a3 = new Alien(3, "Laths");
        System.out.println(a1.name());
        System.out.println(a1 +"   "+  a2+  "  "+a3);
        
    }
}
