class Parent {
    public int contact = 21554;
    // only the object of parent class can call this method
    public int contact( int contact){
        return this.contact;
    }
}

class Student extends Parent{
    // overriding the method contact 
    // child class objects will always execute this method as it is overrided to access teh method of the parent class we need the object of parent class then
    private int contact = 111222;
    public int contact(int contact){
        return this.contact;
    }

}
public class Method_Overriding {

    public static void main(String[] args) {
        
    Parent p = new Parent();
    Student s = new Student();
    System.out.println(p.contact(5));
    System.out.println("Method overriding happens here:");
    System.out.println(s.contact(7));
    }
}
