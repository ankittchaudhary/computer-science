public class NarrowingDemo {
    public static void main(String[] args) {
        //Narrowing or DownCasting - means explicitly storing larger data value in smaller data type

        byte b =10;
        short s=10;
        int i =10;
        long l = 10;
        float f =10.6f;
        double d = 10;
        char c =10;
        boolean bl = true;

        // Narrowing
        b =(byte)s; //means here we are adjusting short value in the byte explicitly
        System.out.println(b); //10 here no data loss because 10 can be stored in byte easilty

        i = (int)f;
        System.out.println(i); //10 successfully downcasted explicitly but data loss is seen, og was 10.6 and we get 10 only

        //i = (int)bl; //not allowed; because boolean cant be stored in int, explitly also, //not compatible
    }
}
