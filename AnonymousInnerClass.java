class A{
    public void method(){
        System.out.println("method of A running");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        A obj = new A(){
            public void method(){
                System.out.println("Method of anonymous inner class running");
            }
        };
        obj.method();
    }    
}
