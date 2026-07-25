// Concept: If two objects are of same class we can have two different values of the same variable using objects as they will store different variables see the example of obj and obj1


class calci{
    int num =10;
    public int add(int a, int b){
        return (a+b);
    }
}

public class Stacks_and_Heaps {
    public static void main(String args[]){
        int data = 11;
        calci obj = new calci();
        calci obj1 = new calci();
        int r =obj.add(452, 254);
        System.out.println(r);
        obj.num = 116;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
