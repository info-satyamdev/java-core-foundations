class Mobile{
   // instance variables
     int price;
   //   static variable
     static String name;
     String brand;
    // only static variables can be called inside static method
    // static method can call instance varibale only when a object is created for the instance variable
     public static void show ( Mobile obj){
        System.out.println("Price " + obj.price + " - Name : " + name + " - Brand : " + obj.brand);
     }
}

public class static_methods {
   @SuppressWarnings("static-access")
   public static void main(String args[]){
      
      Mobile m1 = new  Mobile();
      m1.name = "Smartphone";
      m1.price = 125550;
      m1.brand = "Apple";
      Mobile m2 = new  Mobile();
      m2.name = "Smartphone";
      m2.price = 14000;
      m2.brand = "Motorola";
      Mobile m3 = new  Mobile();
      m3.name = "smarthphone";
      m3.price = 45000;
      m3.brand = "samsung";
      m3.show(m1);
      m2.show(m2);
      m1.show(m3);
      // static variables are going to change there values if only one of the objects variable is changed 
      // m3.name = "dhinchak dhinchak"; -->also right but bad practice
      Mobile.name ="dhinchak dhinchAK" ;

      m3.show(m1);
      m2.show(m2);
      m1.show(m3);
      

   }
    
}

