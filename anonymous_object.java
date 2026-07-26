class ObjectsInJava{
    public ObjectsInJava(){
        System.out.println("object created and by default the constructor runs");
    }
    public void show(){
        System.out.println("method 1");
    }
}


public class anonymous_object {
    public static void main(String args[]){
        ObjectsInJava obj;
        // object created, object is created when we do new ObjectsInJava(); and it is being assigned to obj 
        obj = new ObjectsInJava();
        System.out.println("---------");
        obj.show();



        // therefore the below command also creates an object, and the default constructor will run again and generate an output again
        new ObjectsInJava(); //anonymous object created here
    }
}
