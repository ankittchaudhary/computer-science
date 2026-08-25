public class Main {
    public static void main(String[] args) {
        //Bit-wise operators AND, OR, XOR


        // AND(&) OPERATOR
        int x = 10, y = 6, z;
        z = x&y; //& means and
        System.out.println(z); //2 how??

        /*
        10 -> 0 0 0 0 1 0 1 0
        6  -> 0 0 0 0 0 1 1 0
        --------------------------
        z  -> 0 0 0 0 0 0 1 0 //2    see notes.md how and operator work
        */


        // OR(|) operator
        int p=0b1010; //10
        int q=0b0110; //6
        int r = p|q;
        System.out.printf("OR of %d and %d is %d",p,q, r); //14 how??
        System.out.println();

        /*
        10 -> 0b1010
         6 -> 0b0110
         ------------
         r -> 0b1110 //14 
        */

         //XOR (^) Operator
         r=p^q;
         System.out.printf("XOR of %d and %d is %d",p,q,r);

    }
}
