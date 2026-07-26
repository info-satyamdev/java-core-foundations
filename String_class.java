public class String_class {
    public static void main(String args[]){
        
        
        // creating a string using new keyword or i can say as an object of string class
        String nmr = new String("Developers");
        System.out.println(nmr);
        System.out.println(nmr.length());
        System.out.println(nmr.charAt(1));
        System.out.println(nmr.indexOf( "e"));
        System.out.println(nmr.lastIndexOf("e"));
        System.out.println(nmr.substring(1, 5));
        System.out.println(nmr.toUpperCase());
        System.out.println(nmr.toLowerCase());
        System.out.println(nmr.replace("e", "a"));
        System.out.println(nmr.concat(" are awesome"));
        System.out.println(nmr.trim());
        System.out.println(nmr.equals("Developers"));
        System.out.println(nmr.equalsIgnoreCase("DEVELOPERS"));
        System.out.println(nmr.startsWith("Deve"));
        System.out.println(nmr.endsWith("ers"));
        System.out.println(nmr.contains("are"));
    }
}
