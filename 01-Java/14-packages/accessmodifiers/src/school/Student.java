package school;

public class Student {
    int a = 10; //default: accessible in same package subclass, means within school package but not in test
    private int b = 20; //accessible in this class only
    protected int c = 30; //accessible everywhere except different package non sub class
    public int d = 40; //accessible everywhere

    public void display(){  //accessible everywhere
        System.out.println(a+", "+b+", "+c+", "+d);
    }
}
