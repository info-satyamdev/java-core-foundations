class DevException extends Exception{
    public DevException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        String obj = "Developer";
        try {
            if (obj.contains("v")){
                throw new DevException(obj);
            }
        } catch (Exception e) {
            System.out.println("Custom Exception from Developer");
        }
    }
    
}
