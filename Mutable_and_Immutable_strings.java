public class Mutable_and_Immutable_strings {
    public static void main(String args[]){
        // immutable string: creates garbage memore for old string as now in example the variable a is gonna contain the new string developers are awesome and the old string developers is gonna be garbage collected
        String a = "developers";
        a =a +" Are awesome";
        System.out.println(a);
        // its for the length of immutable string and the capacity and length of immutable strings are same
        System.out.println("Length of immutable string: "+a.length());


        // Stringbuffer :creates a single memory location for the string and the old string is not gonna be garbage collected and the new string is gonna be stored in the same memory location as the old string
        StringBuffer b = new StringBuffer("developers");
        b.append(" Are awesome");
        System.out.println(b);
        // its for the length of mutable string and the capacity of mutable strings is greater than the length of the string
        System.out.println("Length of mutable string: "+b.length());
        System.out.println("Capacity of mutable string: "+b.capacity());
        b.append(" and great");
        b.delete(11, 17);
        System.out.println(b);
        b.reverse();
        System.out.println(b);
        b.reverse();
        System.out.println(b);
        b.deleteCharAt(5);
        b.insert(11, "dhinchak dhinchak");
        System.out.println(b);
    }
}
