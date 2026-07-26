class Mobile{
   // instance variables
     int price;
   //   static variable
     static String name;
     String brand;

     public void show (){
        System.out.println("Price " + price + " - Name : " + name + " - Brand : " + brand);
     }
}

public class static_variable {
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
      m3.show();
      m2.show();
      m1.show();
      // static variables are going to change there values if only one of the objects variable is changed 
      // m3.name = "dhinchak dhinchak"; -->also right but bad practice
      Mobile.name ="dhinchak dhinchAK" ;

      m3.show();
      m2.show();
      m1.show();
      

   }
    
}
