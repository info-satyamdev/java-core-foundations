interface Mobile{
    // keywords in interface are always final and static
    int weight = 200;
    // methods in interface are always abstract and public so if a class implements an interface the methods needs to be implemented
    void camera();
    void call();
}
class Samsung implements Mobile{
    public void camera(){
        System.out.println("64MP");
    }
    public void call(){
        System.out.println("Ringing.....");
    }
}
public class InterfaceInJava {
    public static void main(String[] args) {
        Samsung F14 = new Samsung();
        F14.camera();
        F14.call();
        System.out.println(Samsung.weight);
    }
}
