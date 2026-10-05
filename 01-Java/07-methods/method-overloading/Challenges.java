public class Challenges {
    public static void main(String[] args) {
        //1. Overload method to calculate area

        //circle
        System.out.println(area(7));
        
        //rectangle
        System.out.println(area(6, 7));
    }

    //1.1
    static double area(double radius){
        return Math.PI*radius*radius;
    }

    //1.2
    static double area(double length, double breadth){
        return length*breadth;
    }
}
