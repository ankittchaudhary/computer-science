package challenges;
public class MatrixAddition {
    public static void main(String[] args) {
        

        //1. Adding two matrices
        // require same dimension for adding or substracting matrices


        int [][] A = {{2, 3, 5}, {6, 7, 9}, {4, 3, 5}}; //3x3
        int [][] B = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}}; //3x3
        
        int [][] C = new int [A.length][A.length]; //sum matrix 3x3

        for(int i = 0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){             //why A[0] and not B[0]: because both are of same size so does not matter, and its not jagged either
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        PrintArray.print2D(C);

    }
    // static void print(int arr[][]){
    //     for (int[] row : arr) {
    //         for (int elem : row) {
    //             System.out.print(elem+" ");
    //         }
    //         System.out.println();
    //     }
    // }

}
