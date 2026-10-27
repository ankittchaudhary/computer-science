class Rectangle{
    int length;
    int breadth;
    int x=10;

    Rectangle(int length, int breadth){
        this.length=length;  //this is ref to current obj
        this.breadth=breadth;
    }
}

class Cuboid extends Rectangle{
    int height;
    int x =20;

    Cuboid(int l, int b, int h){
        super(l, b); // ref. to super class or parent class, calls parent's parameterized constructor
        height=h;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
    
    int volume(){
        return length*breadth*height;
    }
}

public class ThisSuper {
    public static void main(String[] args) {
        //
        Cuboid c = new Cuboid(10, 20, 30);
        c.display();
        System.out.println(c.volume());
    }
}
