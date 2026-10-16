class Parent{
    //non parameterized constructor
    public Parent(){
        System.out.println("Non-parameterized parent constructor");
    }
    public Parent(int x){
        System.out.println("Parameterized parent constructor "+x);
    }
}

class Child extends Parent{
    //non parameterized child constructor
    public Child(){
        System.out.println("non-parameterized child constructor");
    }
    //parameterized
    public Child(int y){
        System.out.println("parameterized child constructor");
    }

    //to call  parameterized constructor of parent class
    Child(int x, int y){
        super(x); // call super class constructor with parameter
        System.out.println("2 params");
    }
}


public class Main {
    public static void main(String[] args) {
        //Parameterized constructor in Inheritence

        //Child c = new Child(); // when calling it 1. non parameterized constructor of parent called then non parameterized constructor of child class

        // now 
        //Child c = new Child(20); //1. non parameterized constructor of parent called then parameterized constructor of child class

        //but we want to call the parametrized constructor of parent in child
        Child c = new Child(2, 6); //calls paremeterized constructor of parent
    }
}
