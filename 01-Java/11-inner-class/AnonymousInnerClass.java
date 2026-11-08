abstract class My{
    abstract void display();
}

class AnonymousOuter{
    public void meth(){
        //         AnonymousInner Class
        My m = new My(){ //here My obj is created, first My is ref of abstract class as we can, and the My after new is for obj creation
            public void display(){ //display method ob absract class is overrided so it is now concrete class
                System.out.println("Hello");
            }
        };
        m.display(); //as the inner one is concrete obj is created and we can use it
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        //Anonymous Inner Class are defined at time of creating object
        //useful for implementing interfaces and using inherting abstract class
        AnonymousOuter ao = new AnonymousOuter();
        ao.meth(); //Hello
    }
}
