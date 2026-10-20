class Super{
    public void display(){
        System.out.println("Hello from super class");
    }
}

class Sub extends Super{
    @Override  // by default override also do not use when display method below takes parameter, because then its method overloading (diff parameter possible)
    public void display(){
        System.out.println("Hello from subclass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        //Method Overriding: method of super class overshadowed by sub class
        Super sup = new Super();
        sup.display(); //Hello from super class

        Sub sb = new Sub();
        sb.display(); //Hello from subclass,  sb object also have display method of super class because its extending super but that method is shadowed

        Super s = new Sub(); //ref of super obj of sub
        s.display(); //subclass as method of current obj is called
    }
}
