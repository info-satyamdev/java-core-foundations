enum Laptop{
    Mac(120000), Samsung(80000), Lenovo(50000), Dell(60000), MSI;
    private int price;

    // this default constructor will set all the missing values of objects with no price set as its default value and constructor will be called only when no value is assigned
    private Laptop(){
        price =50000;
        System.out.println("Default constructor called");
    }
    private Laptop(int price){
        this.price = price;
        System.out.println("Parameterized constructor called");
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        for(Laptop lap: Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
