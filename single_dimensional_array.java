public class single_dimensional_array {
    public static void main(String args[]){
        // static array
        int arr1[]={1,2,3,4,5};
        // basic way to print array
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        

        // loop way to print array
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        // dynamic array
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
