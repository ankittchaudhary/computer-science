class Rectangle{
    double length;
    double breadth;

    // Default constructor: provided by compiler: takes no arguments and initialize default values like for int its 0, for String its null
    public Rectangle(){ //optional by default created by compiler with default values
        length=0; //optional
        breadth=0; //optional
    }

    // Parameterized: takes arguments
    // constructors supports overloading(same name but diff parameters) also just like methods 
    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

public class Constructors {
    public static void main(String[] args) {
        /*
        Constructors: block of code automatically called wherenever an obj of class is created
        Job: initialize properties of the class
        Rules:
        - 1. Exact same name as class name.
        - 2. No return type: not even void
        - 3. Automatic invocation
        */
        Rectangle r1 = new Rectangle(); //default
        System.out.println(r1.length); //0.0

        Rectangle r2 = new Rectangle(12, 16);
        System.out.println(r2.length); //12.0
        
    }
}
