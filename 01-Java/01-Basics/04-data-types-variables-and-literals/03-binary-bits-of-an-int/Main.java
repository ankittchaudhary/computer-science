public class Main {
    public static void main(String[] args) {
        //Check Binary Bits of an Integer
        int x = 5;
        System.out.println(Integer.toBinaryString(x)); //101

        int y = -5;
        System.out.println(Integer.toBinaryString(y)); //11111111111111111111111111111011 //32 bits //as int is 4 bytes so = 32 bits
    }
}
