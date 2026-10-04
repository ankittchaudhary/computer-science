public class MethodOverloading {
    public static void main(String[] args) {
        // same name methods but differ in no. of parameters or data type

        //1.
        System.out.println(max(10,5));

        //2.
        System.out.println(max(3.6f, 6.8f));

        //3.
        System.out.println(max(2, 8, 6));
    }

    //1.
    static int max(int x, int y){
        return x>y?x:y;
    }

    //2.
    static float  max(float x, float y){
        return x>y?x:y;
    }

    //3. 
    static int max(int x, int y, int z){
        if (x>y && x >z){
            return x;
        }
        else if (y>z){
            return y;
        }
        else{
            return z;
        }
    }
}
