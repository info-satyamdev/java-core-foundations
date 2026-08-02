import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimizingInputWithTry {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num1 = 0;
        System.out.println("Enter Input");
        // new way to use try block without having the need to use catch block and with default closing of bufferReader and finally
        try(BufferedReader brd = new BufferedReader(new InputStreamReader(System.in)))
        {
            num1 = Integer.parseInt(brd.readLine());
            System.out.println("Input:" + num1);
        }
        // older way of doing it was=>
        // int num = 0;
        // BufferedReader br = null;
        // // way to use try without catch block
        // try{
        //     System.out.println("Enter the Input:");
        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println("Input was:" + num);
        // }
        // finally{
        //     br.close();
        // }
        
    }
}
