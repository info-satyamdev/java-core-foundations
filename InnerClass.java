class Base {
    public void functions() {
        System.out.println("Base functions with inner class");
    }

    class Advance {
        public void functionsAdvance() {
            System.out.println("Advanced Functions with inner class");
        }
    }
}
class Base2 {
    public void functions() {
        System.out.println("Base functions with static outer class");
    }
    static class Advance2 {
        public void functionsAdvance() {
            System.out.println("Advanced Functions with static inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Base bobj = new Base();
        Base.Advance obj = bobj.new Advance();
        obj.functionsAdvance();
        bobj.functions();
        // bobj.functionsAdvance(); --not possible as only object of inner class can
        // access the inner method
        // obj.functions(); --not possible as object of inner class can't access the outer class element
        // if the inner class is static it can be implemented direcly it doesn't require object of outer class
        Base2 bobj2 = new Base2();
        Base2.Advance2 obj2 = new Base2.Advance2();
        obj2.functionsAdvance();
        bobj2.functions();
    }
}
