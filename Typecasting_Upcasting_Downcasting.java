class Abb {
    public void show1() {
        System.out.println("Statement A");
    }
}

class Bbb extends Abb {
    public void show2() {
        System.out.println("Statement 2");
    }
}

public class Typecasting_Upcasting_Downcasting {
    public static void main (String args[]) {
        // 1. Primitive Typecasting
        double a = 4.5;
        int b = (int) a;
        System.out.println(b); // Outputs: 4
        
        // 2. Upcasting (Child object to Parent reference)
        // We create a Bbb object, but store it in an Abb variable.
        Abb obj = new Bbb(); 
        obj.show1(); // Works fine. 
        // obj.show2(); // ERROR: Abb reference doesn't know about show2() yet.

        // 3. Downcasting (Parent reference back to Child reference)
        // Because 'obj' is actually a Bbb in memory, this cast is safe.
        Bbb obj1 = (Bbb) obj; 
        obj1.show2(); // Works fine!
    }    
}