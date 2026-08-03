import java.util.ArrayList;

import java.util.Collection;
import javax.xml.transform.Source;

public class ArrayListsa{
    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<Integer>();
        num.add(5);
        num.add(4);
        num.add(7);
        num.add(9);

        for(Object n :num){
            int nums = (Integer)n;
            System.out.println(nums);
        }
    }    
}
