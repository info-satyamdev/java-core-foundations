// Allows to create amultiple mehtods with the same name but requires different parameters

class Calci{
    public int add(int a, int b){
        return(a + b);
    }
    public int add(int c, int d, int e){
        return(c + d + e);
    }
}

public class method_overloading {
    public static void main(String args []){
        
    Calci cal = new Calci();
    int result  = cal.add(45, 45);
    System.out.println(result);
    int result1 = cal.add(41, 58, 94);
    System.out.println(result1);
}

    

}
