class Super{
    public void meth1(){
        System.out.println("Super Meth1");
    }
    public void meth2(){
        System.out.println("Super Meth2");
    }
}

class Sub extends Super{
    @Override 
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("Sub Meth3");
    }
}


public class DynamicDispatch {
    public static void main(String[] args) {
        
        // Sub s = new Sub();
        // s.meth1();
        // s.meth2();
        // s.meth3();

        //Dynamic Method Dispatch: Runtime polymorphism
        Super s = new Sub(); //ref of superclass, anc creating obj of subclass, otherway is not allowed
        s.meth2(); //Sub meth2
        //s.meth3(); will not be availabe as ref is of super class and meth3 is not present there
    }
}
