enum Status{
    Running, Failed, Pending, Success, Aborted; 
}

public class EnumIfElse {
    public static void main(String args[]){
        Status s = Status.Aborted;
        
        if(s == Status.Running){
            System.out.println("Till now all good!");
        }
        else if(s == Status.Failed){
            System.out.println("Try Again");

        }
        else if(s == Status.Pending){
            System.out.println("Wait");
        }
        else if(s == Status.Success){
            System.out.println("Output Generated");
        }
        else if(s == Status.Aborted){
            System.out.println("Process was Aborted please retry");
        }

        switch(s){
            case Running:
                System.out.println("Till now all good!"); break;
            case Failed:
                System.out.println("Try Again"); break;
            case Pending:
                System.out.println("Wait"); break;
            case Success:
                System.out.println("Output Generated");break;
            case Aborted:
                System.out.println("Process was Aborted please retry"); break;
        }

    }
}
