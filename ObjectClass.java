class Laptop{
    String model;
    int price;
    public String toString(){
        return model + ":" + price;
    }
    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;
    }
    
}

public class ObjectClass {
    public static void main(String args[]){
        Laptop msi = new Laptop();
        msi.model = "RTX3060";
        msi.price = 55000;
        Laptop lenovo = new Laptop();
        lenovo.model="Yoga";
        lenovo.price=75000;
        Laptop msi1 = new Laptop();
        msi1.model = "RTX3060";
        msi1.price = 55000;
        System.out.println(msi.toString());
        System.out.println(msi.equals(msi1));
        System.out.println(lenovo.toString());
        System.out.println(lenovo.equals(msi1));
    }
}
