// FunctoinalInterfaces are those interfaces which have only single method
@FunctionalInterface
interface A{
    void a();
}
class B implements A{
    public void a(){
        System.out.println("function interface example");
    }
}
public class FunctionalInterfaceJava {
    public static void main(String[] args) {
        A obj = new B();
        obj.a();
    }
}
