import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsInJava {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(4,7,1,69,2,57,41,94,12);
        // streams can be used only once so they are used to manage large bulky data
        Stream<Integer> s1 = li.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0,(c,e) -> c+e);
        System.out.println(result);
        // s1.forEach(n -> System.out.println(n));
        // reducing the code and making it simpler is possible in streams
        int resultData = li.stream().filter(n -> n%2 ==0).map(n->n*2).reduce(0,(c,e) -> c+e);
        System.out.println("Resulted data"+resultData);
        // sorted value method in streams
        Stream<Integer> sortedValues = li.stream().filter(n -> n%2 ==0).map(n->n*2).sorted();
        System.out.println("Sorted Values");
        sortedValues.forEach(n -> System.out.println(n));
    }
    
}
