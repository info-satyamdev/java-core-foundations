class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1+ n2;
    }
}
// child class is AdvanceCalc here and parent class is Calc 
class AdvanceCalc extends Calc{
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}
class SuperCalc extends AdvanceCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
}
public class MultipleLevelInheritance {
    public static void main(String args[]){
    int a = 15;
    int b = 2;    
    SuperCalc adv = new SuperCalc();
    System.out.println("Basic Calculator class:");
    System.out.println("Addition: " + adv.add(a,b));
    System.out.println("Substraction: " + adv.sub(a,b));
    System.out.println("Advance Calculator class:");
    System.out.println("Multiplication: " + adv.mul(a,b));
    System.out.println("Division: " + adv.div(a,b));
    System.out.println("Power: " + adv.power(a, b));
    }
}
