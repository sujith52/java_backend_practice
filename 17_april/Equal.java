
class Laptop{
     String model;
     int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    // public String toString(){
    //     return model + " : "+ price;
    // }
    // public boolean equals(Laptop that){
    //     if (this.model.equals(that.model) && this.price == that.price)
    //         return true;
    //     else
    //         return false;
    // }
    // this commented code is written by me and this long bla bla was generated using the vscode 
    // source action the hardwork + smart work also inplemented there man !
}

public class Equal {
    public static void main(String[] args) {
        Laptop laps = new Laptop();
        laps.model = "Lenova";
        laps.price = 90000;
        Laptop laps2 = new Laptop();
        laps2.model = "Lenova";
        laps2.price = 90000;
        // System.out.println(laps);

        Laptop laps1 = new Laptop();
        laps1.model = "HP Elitebook";
        laps1.price = 55000;
        // System.out.println(laps1);

        boolean result = laps.equals(laps2);
        System.out.println(result);
    }
    // well this will really hard while this conditional part man !

}
