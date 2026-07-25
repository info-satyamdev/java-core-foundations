public class jagged_and_3D_arrays{
    public static void main(String args[]){
        // jagged array can be explained as a multidimensional array but one of its dimensions is not fixed.
        // example of jagged array:
        int arr [][] = new int [3][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[2];
        // arr[3] = new int[3];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j]= (int)(Math.random()*10);
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ "   ");
            }
            System.out.println();
        }



        // 3D array example:
        int arrr1[][][] = new int[3][4][5];

    }
}