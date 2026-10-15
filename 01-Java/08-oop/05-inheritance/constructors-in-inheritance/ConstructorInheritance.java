class Parent{
    //parent constructor
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    //child constructor
    public Child(){
        System.out.println("Child Constructor");
    }
}


public class ConstructorInheritance {
    public static void main(String[] args) {
        // Constructors in Inheritance

        /*
        Learning- When we create an obj of child class constructor of parent class is executed first and then child class's constructor get exectuted. //this may sound something else :)
        */

        //Parent p = new Parent();  //parent constructor called
        Child c = new Child(); //both constructors called
    }
}
