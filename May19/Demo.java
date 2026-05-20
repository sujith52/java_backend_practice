
@FunctionalInterface
interface A{
    int show(int i, int j);
}


public class Demo {
    public static void main(String[] args) {
        // A obj = new A() {
        //     public void show(){
        //         System.out.println("This will called as the functional interface SAM");
        //     }
        // };
        // obj.show();
        // A obj = () -> 
        // {
        //     System.out.println("This si the lamda expression !");
        // };
        // A ob = () -> 
        //     System.out.println("This si the lamda shortr expression !");
        // obj.show();
        // ob.show();
        // A obj = (int i, int j) ->
        // {
        //         System.out.println("the addition is "+(i + j));
        // };
        // obj.show(5,6);
        A obj = ( i,  j) -> i+j;
        int res = obj.show(5,6);
        System.out.println(res);
    }
}
