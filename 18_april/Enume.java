
enum Status{
    Swimming, Shooting, Sleeping, Worlding;
}

enum Laptop{
    mackbook(100000), Xps(30000), Thinkpad(60000), Linux;
    private int price;
    
    private Laptop() {
        price = 250;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getprice() {
        return price;
    }
    public void setprice(int price) {
        this.price = price;
    }
    

}

public class Enume {
    public static void main(String[] args) {

        Laptop laps = Laptop.mackbook;
        System.out.println(laps + " "+ laps.getprice());
        for(Laptop lps : Laptop.values()){
            System.out.println(lps+ " : "+ lps.getprice());
        }


        // Status[] sl = Status.values();
        // Status ss = Status.Sleeping;
        // System.out.println(ss);
        // for(Status s : sl){
        //     System.out.println(s + " "+ s.ordinal());
        // }

        // Status s = Status.Worlding;
        // if(s == Status.Shooting)
        //     System.out.println("This will died man !");
        // else if( s == Status.Sleeping)
        //     System.out.println("You slept a day bro !");
        // else if(s == Status.Swimming)
        //     System.out.println("You drowned in lake bro");
        // else if (s == Status.Worlding)
        //     System.out.println("the world will not listen to you man !");

        // Status s = Status.Sleeping;
        // switch(s)
        // {
        //     case Sleeping:
        //         System.out.println("ifyou are sleeping means no obession !");
        //         break;
        //     case Shooting:
        //         System.out.println("The shotts were fired");
        //         break;
        //     case Worlding:
        //         System.out.println("the world is not for you man !");
        //         break;
        //     case Swimming:
        //         System.out.println("swim ");
        //         break;
        //     default:
        //         System.out.println("the world id hell amnd ");
        // }

    }
}
