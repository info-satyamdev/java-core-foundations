import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachAndConsumer {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(4,5,6,7,1,2,9,41);
        Consumer<Integer> cons =(Integer n) ->{
                System.out.println(n);
            };
        arrays.forEach(cons);
    }     
}
