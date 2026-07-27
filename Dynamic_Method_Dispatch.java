class A{
    public void show(){
        System.out.println("Reference of A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Reference of B");
    }
}
class C extends B{
    public void show(){
        System.out.println("Reference of C");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        System.out.println("Object of A but");
        A obj = new A();
        obj.show();
        System.out.println("Object of A but");
        obj = new B();
        obj.show();
        System.out.println("Object of A but");
        obj = new C();
        obj.show();
    }
}
