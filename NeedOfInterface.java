interface Computer{
    void code();
}

// abstratc was also an option but it makes it complex on long run and since interface variables are always final and static it creates a difference
// abstract class Computer{
//     public abstract  void code();
// }
class Laptop implements Computer{
    public void code(){
        System.out.println("Laptop: code, compile, debug, run...");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop: code, compile, debug, run...");
    }
}

class Developer{
    public void develop(Computer cp){
        cp.code();
    }
}
public class NeedOfInterface {
    public static void main(String args[]){
        Laptop lenovo = new Laptop();
        Desktop samsung = new Desktop();
        Developer sam = new Developer();
        sam.develop(samsung);
        System.out.println("-----");
        sam.develop(lenovo);
    }
}
