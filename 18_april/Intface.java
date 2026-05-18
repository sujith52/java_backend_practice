
interface Comp{
    void code();
}

class Developer{
    public void App( Comp lap){
        lap.code();
    }
}

class Lap implements Comp{
    public void code(){
        System.out.println("The code of the Laptop");
    }
}

class Desk implements Comp{
    public void code(){
        System.out.println("Desktop with ram and new things !");
    }
}


public class Intface {
    public static void main(String[] args) {
        Comp obj1 = new Desk();
        Comp onj2 = new Lap();
        Developer sujith = new Developer();

        sujith.App(onj2);
    }
}