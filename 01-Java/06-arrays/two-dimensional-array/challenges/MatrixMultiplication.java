package challenges;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int [][] A = {{2, 3, 5}, {6, 7, 9}}; //2x3
        int [][] B = {{1, 5}, {3, 9}, {7, 2}}; //3x2

        int [][] C = new int[A.length][B[0].length]; //2x2

        //elems of rows of A are mutiplied with elems of col of B and added
        for(int i =0; i<A.length; i++){  //loops theough rows of A
            for(int j =0; j<B[0].length; j++){ // Loops through columns of B
                for(int m =0; m<A[0].length; m++){ // Moves across A's columns & down B's rows
                    C[i][j] += A[i][m]*B[m][j];
                }
            }
        }

        PrintArray.print2D(C);
    }
}
