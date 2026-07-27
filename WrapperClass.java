public class WrapperClass {
    public static void main(String[] args) {
        int num = 5;
        // Integer num1 = new Integer(num); //Autoboxing
        Integer num3 = num; //also autoboxing
        Integer num2 = 5; //object of integer class created here
        int num4 = num2.intValue();//converting the object into primitve data type also called as auto unboxing
        String str = "122";
        int num5 = Integer.parseInt(str);
        int result = num5*5;
        System.out.println(result);
    }   
}
