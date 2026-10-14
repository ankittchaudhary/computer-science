class Circle{
    public double radius;
    public Circle(){
        radius=0.0;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Cylinder extends Circle{
    //everything from circle class will be available, but cant guarantee accessible 
    //as radius is public in parent class it will be accessible
    public double height;
    public double volume(){
        return area()*height;
    }
}



public class Inheritance {
    public static void main(String[] args) {
        //Inheritance: acquiring features (properties and methods) from existing class (parent) into new class (child)

        Cylinder cl1 = new Cylinder();
        cl1.radius=7; //inheriting the radius property
        cl1.height=10;

        System.out.println(cl1.volume());
        System.out.println(cl1.area()); //inheriting the method
    }
}
