
class Outer{
    int x = 10;

    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println("Inner executed, outer variable: "+ x); //Inner Class can directly access variables of outer class directly
            System.out.println("Inner local variable:  "+y);
        }
    }

    public void outerDisplay(){
        System.out.println("Outer variable: "+ x);

        //outer class can't directly access the variables of inner class, we make obj first
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("Accessing variable of inner class by first creating obj of it: "+ i.y);
    }
}


public class NestedInnerClass{
    public static void main(String[] args) {
        // Nested Inner Class Example
        // 
        Outer o = new Outer();
        o.outerDisplay();

        //to directly access inner class in main method
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
        System.out.println(oi.y);
    }
}