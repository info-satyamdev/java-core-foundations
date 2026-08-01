public class ExceptionHandlingJava {
    public static void main(String[] args) {
        int i = 155;
        int j = 40;
        int k = 0;
        int f = 0;
        int arr[ ]={1,2,3};
        try {
            f = i*j/k;
            System.out.println(arr[4]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled successfully");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Limit out of bount for the array");
        }
        System.out.println(f);
    }    
}
