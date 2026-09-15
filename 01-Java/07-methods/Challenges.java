public class Challenges {
    public static void main(String[] args) {
        //1. Check if number is prime
        int num =5;
        System.out.println(isPrime(num));

    }

    static boolean isPrime(int num){
        if (num<=1) {
            return false;
        }
        for(int i =2; i< (int) Math.sqrt(num); i++){
            if(num%2==0) return false;
        }
        return true;
    }
}
