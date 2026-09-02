public class Main {
    public static void main(String[] args) {
        //Logical Operators
        /*
        - Works on boolean values only

        &&  and
        ||  or
        !   not

        A   B   A&&B   A||B   !A
        T   T    T      T      F
        T   F    F      T      F
        F   T    F      T      T
        F   F    F      F      T

        */

        int a = 5;
        int b = 6;
        int c = 10;
        System.out.println(a>b || a>c); // F || F -> F
        System.out.println(a<b || a>c); // T || F -> T
    }
}
