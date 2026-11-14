package test;
import school.*;

class Test2 extends Student{
    //c was protected, and this is subclass of different package so here it will be accessible
    Test2(){
        System.out.println(c); //accessible as its subclass
    }
}

public class Test {
    public static void main() {
        Student s = new Student();
        s.display();

        //a: default, b: private, c:protected, d:public

        //System.out.println(s.a); //not accessible as default only accessible within same package
        //System.out.println(s.b); //not accessible as private only accessible within same class
        //System.out.println(s.c); //not accessible as protected not accessible in different package non subclass
        System.out.println(s.d); //accessible everywhere
    }
}
