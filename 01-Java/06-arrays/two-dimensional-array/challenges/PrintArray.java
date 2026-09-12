package challenges;

public class PrintArray {
    // Making it public and static allows any class in your package to use it
    // public means it can be accessed from ANY package in the project
    // static means it belongs to the class, so we can use it without creating an object
    public static void print2D(int[][] arr) { 
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void print1D(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
