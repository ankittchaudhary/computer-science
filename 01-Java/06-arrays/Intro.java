public class Intro{
    public static void main(String[] args) {
        /*
        Arrays is collection of similar data elements
        X = [8, 3, 9, 5, 6];
        */

        //Creating an array
        int names[] = new int[5];
        //    |               |
        // reference        size
        //            ----------
        //               obj -> created in heap
        //System.out.println(names.length); //5

        int a[] = {1, 4, 3, 4, 7}; //directly proving valies
        //System.out.println(a.length); //5


        //Accessing elements
        //System.out.println(a[0]);
        //                     |
        //                     1

        //using for loop
        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }

        //using foreach loop
        for (int x : a) {
            System.out.println(x);
        }

    }
}