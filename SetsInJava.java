import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsInJava {
    public static void main(String[] args) {
        // hashset
        Set<Integer> num2 = new HashSet<Integer>();
        num2.add(9);
        num2.add(5);
        num2.add(4);
        num2.add(7);
        num2.add(9);
        System.out.println("Hashset:");
        for(Object n2 :num2){
            int nums2 = (Integer)n2;
            System.out.println(nums2);
        }
        Set<Integer> num3 = new TreeSet<Integer>();
        num3.add(9);
        num3.add(4);
        num3.add(5);
        num3.add(7);
        num3.add(9);
        System.out.println("Treeset:");
        for(Object n3 :num3){
            int nums3 = (Integer)n3;
            System.out.println(nums3);
        }
    }
}
