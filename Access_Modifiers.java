class Human{
    public String name = "Developer"; //can be used anywhere
    protected int age = 21; //can't be used in a different package which doesn't extend this class 
    private int mobile = 554466;
}
class Details{
    public void show(){
        Human h = new Human();
        System.out.println(h.name + ":" + h.age); //h.mobile can't be used as it is private
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        Details d = new Details();
        d.show();
    }
}
