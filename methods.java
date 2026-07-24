class Computer{
    public int calciAdd(int a, int b){
        return (a+b);
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
public class methods{
    public static void main (String args[]){
        Computer cmp = new Computer();
        int result = cmp.calciAdd(25, 4875);
        cmp.playMusic();
        System.out.println(result);
    }
}