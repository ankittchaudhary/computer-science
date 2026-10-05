public class Main {
    public static void main(String[] args) {
        // Recursion: method calling itself

        int num = 5;
        System.out.println(factorial(num));
    }

    //Factorial of a number using recursion
    static long factorial(int num){
        if(num<0){
            System.out.println("Factorial not possible for negative nums");
            return 0;
        }
        if (num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
