class DevException{
    public void Dev() throws ClassNotFoundException{
        Class.forName("DJ");
    }
}
public class DuckingException {
    public static void main(String[] args) {
        DevException dev = new DevException();
        try {
            dev.Dev();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception handled completely by main method which was thrown from Dev method:" + e);
        }
    }
}
