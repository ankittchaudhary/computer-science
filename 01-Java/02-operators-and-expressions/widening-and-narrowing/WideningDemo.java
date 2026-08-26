public class WideningDemo {
    public static void main(String[] args) {
        //Widening or UpCasting - means storing data of smaller data type into bigger one
        //Should satisfy two rules
        // 1. Size: smaller one can be stored in larger data type
        // 2. Compatibility: eg: storing int in float: 12->12.0 // allowed

        byte b =10;
        short s=10;
        int i =10;
        long l = 10;
        float f =10;
        double d = 10;
        char c =10;
        boolean bl = true;

        // Widening
        s =b; //means assigning byte value in short is possible as size of byte << short, and also compatible
        i =s; // similarly
        l =i;
        f =l;
        d =f;

        //c =d; //not possible as char size is smaller 
        //d =bl; // d is larger data type but not compatible 
        //b = s; //assigning short in byte not possible, narrowing is used See NarrowingDemo.java
    }
}
