interface Mobile{
    int weight = 200;
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
