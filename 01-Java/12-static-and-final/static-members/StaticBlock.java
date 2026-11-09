class My{
    static int s;


    //Block
    {
        System.out.println("Block 1");
        s=10; //does not affect the static ones, its only limited to the block
    }

    //static block
    static {
        System.out.println("Block 2 "+s); //0 default value
        s=20; //made the 
    }

    static {
        System.out.println("Block 3");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        // Static Block
        // set of statements grouped together as a block
        // declare that block as static
        // executed when class is loaded.. before creation of any obj of that class

        //use case: mostly used for initialization
        System.out.println(My.s);

        //if we create obj of class, the static blocks will execute automatically
        My m = new My();
    }
}
