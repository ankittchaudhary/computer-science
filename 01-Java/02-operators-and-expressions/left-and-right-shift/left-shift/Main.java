public class Main {
    public static void main(String[] args) {
        //Left(<<), Right (>>), Unsigned Righ Shif (>>>)

        //LEFT SHIFT(<<)
        int x=0b1010;
        int y = x<<1; //1 means left shift by 1
        System.out.printf("%d left shift by 1 becomes %d", x,y); //20
        System.out.println();

        //how??
        /*
        left shift by 1 , means shift the bits to left by 1 place
        x -> 0 0 0 0 1 0 1 0
            / / / / / / / /
             0 0 0 1 0 1 0 _
                           |
                           occupy by 0 itself
             0 0 0 1 0 1 0 0 //which is 20
        */

        //note: left shift a number 'n' by 'k' places becomes -> n*2^k
        // so left shift 10, by 2 places will be 10*(2^2)=40
    }
}
