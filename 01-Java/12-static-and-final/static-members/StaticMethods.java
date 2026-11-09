class Test{
    static int y =20;
    int z =10;
    
    //static method
    static void display(){
        System.out.println(y); //20
        //System.out.println(z); //static method can not access non static members
    }
}
public class StaticMethods {
    public static void main(String[] args) {
        /*
        - static methods generally used for returning computed value for all objects
        - belong to a class shared among all objects
        - can be directly called using class name
        - can access only static members
        */
       Test.display(); //20

       Test t1 = new Test();
       t1.display(); //20
       t1.y=30; //made the y 30
       t1.z = 50;

       Test t2 = new Test();
       t2.display(); //30, as its shared
       System.out.println(t2.z); //10 //not changed because it's not static, and local to each obj
    }
}
