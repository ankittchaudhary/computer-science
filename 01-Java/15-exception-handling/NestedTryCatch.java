import java.util.Scanner;

class NestedTryCatch {
    public static void main(String[] args) {
        //Nested try catch


        // int A[] = { 30, 32, 16, 8, 42, 0 };

        // System.out.println(A[0]/A[7]); //index out of bound, as max is 4

        // System.out.println(A[0]/A[5]); //again its error as divide by 0

        // System.out.println("Remaining code should not be affected");


        //handling
        int A[] = { 30, 32, 16, 8, 42, 0 };
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two indexes: ");
        int indx1 = sc.nextInt();
        int indx2 = sc.nextInt();

        try{
            int c = A[indx1]/A[indx2];
            System.out.println(c);

            //nesting
            try{
                System.out.println(A[8]); //out of index bound
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            } 
            
        } catch(ArithmeticException e){
            System.out.println(e);
        } finally{
            System.out.println("Finally definitely gets executed");
        }

        System.out.println("Bye");
    }
}
