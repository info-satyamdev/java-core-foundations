@FunctionalInterface
interface A{
    void method(int i);
}
@FunctionalInterface
interface B{
    int method(int j);
}
// lambda expressions only works with functional interface
public class LambaEmpressionsJava {
    public static void main(String[] args) {
        A obj = (int i) -> System.out.println("Lamba Expressions method output 1" + ":" + i);
        obj.method(4);
        A obj1 = (int i) -> {
            System.out.println("Lamba expressions method output 2" + ":" + i);
            System.out.println("Lamba expressions method output 3" + ":" + i);
        };
        obj1.method(5);
        B obj2 = (int i) ->  i*5;
        System.out.println(obj2.method(5));
    }    
}
