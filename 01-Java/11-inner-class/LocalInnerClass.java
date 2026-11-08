class LocalOuter{
    public void display(){
        class LocalInner{
            public void innerDisplay(){
                System.out.println("Hello");
            }
        }

        LocalInner i = new LocalInner();
        i.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        // Local Inner Class: Class inside method of outer class
        // outside that method Inner Class has no meaning
        LocalOuter o = new LocalOuter();
        o.display();
    }
}
