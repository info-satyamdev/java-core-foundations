interface A{
    void a();
}
interface B{
    void b();
}
// interfaces can extend interfaces
interface C extends B{
    void c();
}
// class can implement multiple interfaces but can not extend multiplt classes
class X implements A,C{
    public void a(){
        System.out.println("method of a");
    }
    public void b(){
        System.out.println("method of b");
    }
    public void c(){
        System.out.println("method of c");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        X x = new X();
        x.a();
        x.b();
        x.c();
    }
}
