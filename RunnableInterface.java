// class A implements Runnable{     =>Basic way
//     public void run(){
//         for(int i = 0; i<10; i++){
//             System.out.println("Synchronized and prioritized Thread 1");
//             try{
//                 Thread.sleep(10);
//             }catch(Exception e){
//                 System.out.println(e);
//             }
//         }
        
//     }
    // // }
    // class B implements Runnable{
    //     public void run(){
    //         for(int i = 0; i<10; i++){
    //             System.out.println("Synchronized and prioritized Thread 2");
    //             try{
    //                 Thread.sleep(10);
    //             }catch(Exception e){
    //                 System.out.println(e);
    //             }
    //         }
            
    //     }
    // }
public class RunnableInterface {
    public static void main(String[] args) {
        // Runnable obj1 = new Runnable() {     => Second way
        //     public void run(){
        //         for(int i = 0; i<10; i++){
        //             System.out.println("Synchronized and prioritized Thread 1");
        //             try{
        //                 Thread.sleep(10);
        //             }catch(Exception e){
        //                 System.out.println(e);
        //             }
        //         }
        //     }
        // };
        // Runnable obj2 = new Runnable() {
        //     public void run(){
        //         for(int i = 0; i<10; i++){
        //             System.out.println("Synchronized and prioritized Thread 2");
        //             try{
        //                 Thread.sleep(10);
        //             }catch(Exception e){
        //                 System.out.println(e);
        //             }
        //         }
        //     }
        // };

        Runnable obj1 = () ->   //lambda expression way
        {
                for(int i = 0; i<10; i++){
                    System.out.println("Synchronized and prioritized Thread 1");
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            };
            Runnable obj2 = () ->
        {
                for(int i = 0; i<10; i++){
                    System.out.println("Synchronized and prioritized Thread 2");
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                }
            };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
