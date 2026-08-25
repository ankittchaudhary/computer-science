class Main{
    public static void main(String[] args) {
        //Swap two nums without using third variable

        int a = 9;
        int b = 12;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a); //12
        System.out.println(b); //9


        /*
        Behind the scenes
        a = 9 =>  0 0 0 0 1 0 0 1
        b = 12 => 0 0 0 0 1 1 0 0
        
        a = a^b = 0 0 0 0 0 1 0 1
        now again xor of this a with b and store in b
        
        a = 0 0 0 0 0 1 0 1
        b = 0 0 0 0 1 1 0 0
        b = a^b:
        now b becomes: 0 0 0 0 1 0 0 1 //-----------------------------------> 9

        now again xor of this b with a and store in a, we have
        a = 0 0 0 0 0 1 0 1
        b = 0 0 0 0 1 0 0 1
        a = a^b becomes:
        a = 0 0 0 0 1 1 0 0 //----------------------------------------------->12
        */
    }
}