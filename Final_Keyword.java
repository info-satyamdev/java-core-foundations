// final - object, method, class
final class A{}
// class B extends A{} -- not possible
//  because the final class can not be a parent class as it can not be inherited by another class
class B{
    final public void show(){
        System.out.println("Class B output here");
    }
    public void config(){
        System.out.println("Class B config output here");
    }
}
class C extends B{
    // public void show(){} --not possible
    // because the final method can not be overrided
    public void config(){
        System.out.println("Class C config output here");
    }
    final public int item =45;
    // final = 44; --not possible
    // because the final variable and objects can not be modified once allocated data in it
}


public class Final_Keyword {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.config();
    }    
}
