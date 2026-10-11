class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l > 0) {
            length = l;
        } else
            length = 0;
    }

    public void setBreadth(double b) {
        if (b > 0) {
            breadth = b;
        } else
            breadth = 0;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        // create obj
        Rectangle r1 = new Rectangle();
        // r1.length=10; //not accessible so we need setters and getters

        r1.setLength(10);
        r1.setBreadth(30);
        System.out.println(r1.area());
    }

}
