public class Intro {
    public static void main(String[] args) {
        //2-D array: is like a matrix
        int arr[][] = new int[3][4]; //3 rows 4 columns

        int arr2[][]={{1,2,3},{4,5,6}}; //2x3

        //int [] E, F[]; //E is 1-D, F is 2-D

        //Display arr2
        for(int i =0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){   //why arr2[i].length ?? because each element of arr2 holds reference of its own row which has its own set of elemets [array] which has some length
                System.out.print(arr2[i][j]+" "); //its like ith row's jth element
            }
            System.out.println();
        }

        //Using for each
        System.out.println("Printing 2D array using for each loop");
        for (int[] is : arr2) {   //why int[] is: because we are not getting element, but an array
            for (int is2 : is) {  //here we are printing elements of the 'is' array
                System.out.print(is2+" ");
            }
            System.out.println();
        }

        //Jagged Array
        int [][] C;
        C = new int [3][]; //3 rows
        
        C[0] = new int [2];  //each row having subarray of this size
        C[1] = new int [4];
        C[2] = new int [5];
       
    }
}
