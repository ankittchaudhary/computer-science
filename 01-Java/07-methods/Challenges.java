public class Challenges {
    public static void main(String[] args) {
        //1. Check if number is prime
        // int num =5;
        // System.out.println(isPrime(num));

        //2. gcd
        // int num1 = 91;
        // int num2 = 13;
        // System.out.println(gcd(num1, num2));

        //3. return max from int array
        int nums[] = {1, 3, 9, 11, 10, 17, 0};
        System.out.println(max(nums));
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

    static int gcd(int num1, int num2){
        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            } else {
                num2 = num2 -num1;
            }            
        }
        return num1;
    }

    static int max(int[] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
}
