class Human{
    private int age = 10;;
    private String name = "Satya";
    private int Mobile = 1234567890;

    // getters
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int getNumber(){
        return Mobile;
    }
    // setters
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setNumber(int m){
        Mobile = m;
    }


    
}

public class encapsulation_java {
    
    public static void main(String args[]){
        Human h1 = new Human();
        // h1.age = 25;
        // h1.name = "Satya";
        // h1.Mobile = 1234567890;
        // getter is used to access the values of private variables

        System.out.println("Human data: " + "Age: " + h1.getAge() + " - Name: " + h1.getName() + " - Mobile: " + h1.getNumber());
        // only using setters we can assign values to private variables
        h1.setAge(15);
        h1.setName("Developer");
        h1.setNumber(5588774);
        System.out.println("after using setter:");
        System.out.println("Human data: " + "Age: " + h1.getAge() + " - Name: " + h1.getName() + " - Mobile: " + h1.getNumber());
        
    }
}
