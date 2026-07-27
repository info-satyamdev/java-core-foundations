abstract class BaseFeature{
    //abstract methods can only be impleted inside abstract class
    public abstract void Camera();
    public void Music(){
        System.out.println("Play Music");
    }
    public void call(){
        System.out.println("Ringing");
    }
    public abstract void video();
}
// class which extends abstract class must have to extend all its abstract methods or it must have to be abstract itself if it can't define the feature itself
 abstract class Samsung extends BaseFeature{
    public void Camera(){
        System.out.println("200MP");
    }
}
//normal class must defin all the undefined abstract methods of abstract class if it extends it
class F14 extends Samsung{
    public void video(){
        System.out.println("Vido quality: goof 120hz");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // object can't be created for abstract class
        Samsung device = new F14();
        device.Camera();
        device.call();
        device.Music();
        device.video();
    }

}
