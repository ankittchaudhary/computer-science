
class Monitor implements Student{
    public void meth1(){
        System.out.println("Hey, I am Monitor");
    }
}

class Topper implements Student{
    public void meth1(){ //meth1 should be here in topper class as well
        System.out.println("Hey, I am the Topper");
    }
}

public class Main {
    public static void main(String[] args) {
        //ref. of Interface, cant create obj of interface
        Student s1= new Monitor();
        s1.meth1();
        Student s2 = new Topper();
        s2.meth1();
    }
}
