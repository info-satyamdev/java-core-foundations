public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 10;
        int j = 8;
        try {
            int k = j/i;
            if(k==0){
                throw new ArithmeticException();
            }
        } catch (Exception e) {
            System.out.println("output not valid, exception: "+ e);
        }
    }
}
