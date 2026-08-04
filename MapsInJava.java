import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapsInJava{
    public static void main(String[] args) {
        // maps are data structures which are generally used where there is a key rather than old indexes
        System.out.println("HashMap Example");
        Map<String, Integer> obj1 = new HashMap<>();
        // keys are unique
        obj1.put("Developer1", 45);
        obj1.put("Developer2", 55);
        obj1.put("Developer3", 65);
        obj1.put("Developer4", 70);
        obj1.put("Developer5", 85);
        obj1.put("Developer6", 95);
        System.out.println(obj1);
        System.out.println(obj1.get("Developer2"));
        System.out.println(obj1.keySet());
        System.out.println("Developer : Packages");
        for( String keys: obj1.keySet()){
            System.out.println(keys + " : " + obj1.get(keys));
        }
        // hashtables are similar as hashmaps but the only keydifference is that hashtables are synchronized but hashmaps are not synchronized
        System.out.println("HashTable Example");
        Map<String, Integer> obj2 = new Hashtable<>();
        // keys are unique
        obj2.put("Developer1", 45);
        obj2.put("Developer2", 55);
        obj2.put("Developer3", 65);
        obj2.put("Developer4", 70);
        obj2.put("Developer5", 85);
        obj2.put("Developer6", 95);
        System.out.println(obj2);
        System.out.println(obj2.get("Developer2"));
        System.out.println(obj2.keySet());
        System.out.println("Developer : Packages");
        for( String keys: obj2.keySet()){
            System.out.println(keys + " : " + obj2.get(keys));
        }

    }
}