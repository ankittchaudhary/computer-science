
//concrete class
// class Super{
//     public Super(){
//         System.out.println("Super Constructor");
//     }
//     public void meth1(){
//         System.out.println("Meth 1 of super");
//     }
// }

abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Meth1 of super class");
    }
    abstract public void meth2();
}

class Sub extends Super{
    //must override absract methods so Sub will be concrete otherwise it will also be abstract
    @Override 
    public void meth2(){
        System.out.println("Sub method 2");
    }
}


public class AbstractClass{
    public static void main(String[] args) {
        
        //Super sp = new Super(); //obj can be created as its concrete class
        //sp.meth1(); 

        //for abstract class obj can not be created but ref can we given
        //Super s = new Super(); // error
        Super s = new Sub(); //possible, can call methods present in super class
        s.meth1();
        s.meth2();
    }
}