class Calci{
    public int add( int n1, int n2) {
        int result = n1 +n2;
        return (result);
    }
}

public class classes_objects {
    public static void main (String args[]){
        Calci c = new Calci() ;
        int num1 = 45;
        int num2 = 645;

        int result = c.add(num1 , num2 );
        System.out.println(result);
    }
    
}
