class Human{
    private int age;
    private String name;
    private int Mobile;
    public Human(){
        age = 20; 
        name = "Developer";
        Mobile = 885544;
    }
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
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(int Mobile){
        this.Mobile = Mobile;
    }
} 
public class constructors {  
    public static void main(String args[]){
        Human h1 = new Human();
        // getter is used to access the values of private variables
        System.out.println("Human data: " + "Age: " + h1.getAge() + " - Name: " + h1.getName() + " - Mobile: " + h1.getNumber());    
    }
}
