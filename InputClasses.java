import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputClasses{
    public static void main(String[] args) throws IOException{

        System.out.println("Input by System.in");
        int num2 = System.in.read();
        while (System.in.available() > 0) {
            System.in.read();
        }
        System.out.println("Input taken as ASCI: " + num2 + " ASCI input -48 is the real input, which is: " + (num2-48));


        System.out.println("Input for BufferedReader input:");
        InputStreamReader in =  new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println("Input was:" + num);
        
        System.out.println("Input from Scanner input");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Input was: " + num1);
        bf.close();
    }
}