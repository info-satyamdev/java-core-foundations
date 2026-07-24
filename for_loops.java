public class for_loops {
    public static void main(String args[]){
        for(int i = 0; i<10; i++){
            System.out.println("Hi" + 5);
        }

        System.out.println("Days and hours");
        for(int j = 1; j<=7;j++ ){
            System.out.println("Day " + j);
            System.out.println("working hours:");
            for(int k = 0; k <= 8; k++){
                System.out.println("    " + (k+9) + " - " + (k+10));
            }
        }

        
    }
}
