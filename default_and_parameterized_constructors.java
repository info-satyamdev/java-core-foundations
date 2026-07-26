class Human{
    private int age;
    private String name;
    // default constructor
    public Human(){
        age = 20;
        name = "Developer";
    }
    // parameterized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Human(String name){
        age= 25;
        this.name = name;
    }
    // getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class default_and_parameterized_constructors {
    public static void main(String[] args) {
        
        Human h1 = new Human();
        System.out.println(h1.getName() + " : " + h1.getAge());
        Human h2 = new Human("Architect");
        System.out.println(h2.getName() + " : " + h2.getAge());
        Human h3 = new Human( 20, "Engineer");
        System.out.println(h3.getName() + " : " + h3.getAge());
    }
}
