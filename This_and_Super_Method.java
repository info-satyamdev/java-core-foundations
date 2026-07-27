class A{
    public A(){
        // super is here because every class in java exxtends Object class
        super();
        System.out.println("default construtor of super parent class");
    }
    public  A(int a){
        
        super();
        System.out.println("parameterized costructor of super parent class");
    }
}
class B extends A{
    public  B(){
        
        super();
        System.out.println("default costructor of parent class");
    }
    public  B(int n){
        // super class allows to call parameterized cosructors of the parent class
        super(n);
        System.out.println("parameterized costructor of parent class");
    }
}
public class This_and_Super_Method{
    public static void main(String args[]){
        int a =5;
        B b1 = new B();
        B b2 = new B(a);
    }
}