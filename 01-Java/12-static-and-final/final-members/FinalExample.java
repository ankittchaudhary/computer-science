class Test{
    // variable
    final int MIN =1;

    //we can define here and initialize using static block or constructor later also
    final int MAX;
    final boolean IS_VERIFIED;

    //initialize
    {
        MAX=10;
    }

    //initialize using constructor
    Test(){
        IS_VERIFIED=true;
    }

    //final methods can not be overrided
    final void testing(){
        System.out.println("Hello");
    }
}

class Test2 extends Test{
    //try to override testing method
    // public void testing(){
    //     System.out.println("Hey");
    // }

    //will give error
}

//final class can not be extended or inherited
final class Super{
    public Super(){
        System.out.println("Hey");
    }
}

// class Sub extends Super{  //can not be extended
//     //
// }


public class FinalExample{
    public static void main(String[] args) {
        //final keyword
        Test t1 = new Test();
        System.out.println(t1.IS_VERIFIED);
    }
}