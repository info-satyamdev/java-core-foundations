class Mobile{
     int price;
     static String name;
     String brand;
    // static block is used to initialize static variables and it is invoked only once when the class is loaded into memory
    static{
        name = "Mobile";
        System.out.println("Static block is invoked");
    }
    // constructor is used to initialize instance variables and it is invoked every time when the object is created
    public Mobile(){
        brand = "Samsung";
        price = 50000;
        System.out.println("Constructor is invoked");
    }
    // static method is used to access static variables and it can be invoked without creating an object of the class but it can invoke non satatic variables and methods by creating an object of the class
    public static void show ( Mobile obj){
        System.out.println("Price " + obj.price + " - Name : " + name + " - Brand : " + obj.brand);
     }
}
public class static_block {
   public static void main(String args[]) throws ClassNotFoundException{     
    // Class.forName() method is used to load the class into memory and it is invoked only once when the class is loaded into memory but it also throws ClassNotFoundException if the class is not found in the classpath
    Class.forName("Mobile");
    System.out.println("Main method is invoked");
      Mobile m1 = new  Mobile();
      m1.name = "Smartphone";
      m1.price = 125550;
      m1.brand = "Apple";
      m1.show(m1);
   }
}

