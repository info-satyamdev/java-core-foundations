enum Status{
    Running, Failed, Pending, Success, Aborted; 
}

public class EnumClass {
    public static void main(String args[]){
        Status s = Status.Aborted;
        System.out.println(s);
        Status[] st = Status.values();
        for(int i = 0; i<st.length; i++){
            System.out.print(st[i] + ",    ");
        }
        for(Status ss :st){
            System.out.println(ss + ":" + ss.ordinal());
        }
    }
}
