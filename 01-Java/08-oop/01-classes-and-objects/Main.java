

class Circle {
    //properties
    public double radius;


    //behaviour/methods
    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class Rectangle{
    public double length;
    public double breadth;

    //methods
    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}

class Cylinder{
    public double radius;
    public double height;

    public double lateralArea(){
        return 2*Math.PI*radius*height;
    }
    public double totalSurfaceArea(){
        return lateralArea()+2*Math.PI*radius*radius;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Main {
    public static void main(String[] args) {
        //create obj of Circle Class
        // Circle c1 = new Circle();
        // //initialize radius for c1
        // c1.radius=7;
        // System.out.println(c1.radius);

        // System.out.println(c1.area());
        // System.out.println(c1.perimeter());

        // //another obj c1 for circle
        // Circle c2 = new Circle();
        // c2.radius=3;
        // System.out.println(c2.area());

        // //obj for rectangle
        // Rectangle r1 = new Rectangle();
        // r1.length=10;
        // r1.breadth=20;

        // System.out.println(r1.area());
        // System.out.println(r1.perimeter());


        //obj for cylinder class
        Cylinder cl1 = new Cylinder();
        cl1.radius=4;
        cl1.height=7;

        System.out.println(cl1.volume());
    }
}
