public class ParameterPassing{
    public static void main(String[] args) {
        //Primitive
        // int a=10, b=20, c;
        // c=add(a,b);
        // System.out.println(c);

        //obj
        String name = "Ankit";
        welcomeName(name);
        
    }

    static int add(int x, int y){
        int z = x+y;
        return z;
    }

    //obj
    static void welcomeName(String n){
        System.out.println("Welcome, "+n);
    }
}