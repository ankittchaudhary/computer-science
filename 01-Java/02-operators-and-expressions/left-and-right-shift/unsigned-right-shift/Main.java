public class Main {
    public static void main(String[] args) {

        //UNSIGNED RIGHT SHIFT(>>)
        int x=-0b1010; //-10
        int y = x>>>1; //1 means unsigned right shift by 1 place
        System.out.printf("%d Right shift by 1 becomes %d\n", x,y); // gives very larg + number because negative nums are stored in 2's compliment, so -10 will become like
        /*
        10 ->  0 0 0 0 1 0 1 0
        -----------------------
        1's -> 1 1 1 1 0 1 0 1
        2's                  1
            -> 1 1 1 1 0 1 1 0 //is -10
        */
       
       System.out.println(Integer.toBinaryString(-10)); 
       // 11111111111111111111111111110110
       // and right shift -10 will be like this
       /*
        1 1 1 1 0 1 1 0
         \ \ \ \ \ \ \ \ 
        _ 1 1 1 1 0 1 1

        1 1 1 1 1 0 1 1 //2147483643
       */ 
      System.out.println(Integer.toBinaryString(2147483643)); //01111111111111111111111111111011
      //                                                           |
      //                                                       means +ve num
    }
}
