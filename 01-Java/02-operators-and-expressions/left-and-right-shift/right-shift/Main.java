public class Main {
    public static void main(String[] args) {

        //RIGHT SHIFT(>>)
        int x=0b1010;
        int y = x>>1; //1 means right shift by 1 place
        System.out.printf("%d Right shift by 1 becomes %d", x,y); //5
        System.out.println();

        //how??
        /*
        left shift by 1 , means shift the bits to left by 1 place
        x -> 0 0 0 0 1 0 1 0
              \ \ \ \ \ \ \ \ 
             _ 0 0 0 0 1 0 1
             |
                           occupy by 0 itself
             0 0 0 0 0 1 0 1 //which is 5
        */

        //note: right shift a number 'n' by 'k' places becomes -> n/(2^k)
        // so right shift 10, by 2 places will be 10/(2^2)=2.5 //but will give 2 as int :)
    }
}
