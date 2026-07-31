abstract class Old {
    public abstract void oldMethod();

}

public class AbstractAndAnonymousClass {
    public static void main(String[] args) {
        Old obj = new Old(){
            public void oldMethod(){
                System.out.println("New mehod");
            }        
        };
        obj.oldMethod();
    }
}
