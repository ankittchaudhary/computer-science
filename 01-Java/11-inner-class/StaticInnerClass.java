class StaticOuter{
    static int x = 10;
    int y = 10;

    static class StaticInner{
        public void display(){
            System.out.println(x);
            //System.out.println(y); // will not work
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        /*
        Static Inner classes are static members of outer class.
        -Objects of static inner class can be created outside inner class and  we dont have ti create obj of outer class, that is the difference from Nested inner class
        that was dependent on outer one. 
        */

        StaticOuter.StaticInner i = new StaticOuter.StaticInner();
        i.display(); 
    }
}
