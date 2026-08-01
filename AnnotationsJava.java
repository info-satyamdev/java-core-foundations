// Deprecated annotation is used as to show which class is going to be removed in future or if there is a better alternative of it
@Deprecated
class A{
    public void method(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    //After using notifications it is compulsory to override a method of parent class this makes debugging easier
    @Override
    public void method(){
        System.out.println("Method of class B overriding A");
    }
}

public class AnnotationsJava {
    public static void main(String[] args) {
        B obj = new B();
        obj.method();
    }
}
