public class BasicMaths {
    public static void main(String[] args) {
        //int num = 1234;

        //1. Count no. of digits
        //System.out.println(countDigits(num));

        //2. Reverse the number
        //System.out.println(reverseNumber(num));

        //3. Is Palindrome
        //int n = 1234321;
        //System.out.println(isPalindrome(n));

        //4. GCD
        // int a = 48;
        // int b = 18;
        // System.out.println(findGCD(a, b));

        //5. Is Armstrong
        // int n = 153;
        // System.out.println(isArmstrong(n));

        //6. Print all Divisors of a num
        // int num =36;
        // printDivisors(num);

        //7. check if num is prime
        int num =3;
        System.out.println(isPrime(num));

    }

    static int countDigits(int num) {
        if (num == 0) return 1;

        long n = Math.abs((long) num);
        int count = 0;

        while (n > 0) {
            count++;       
            n = n / 10; 
        }

        return count;
    }
    static int reverseNumber(int num){
        int rev=0;
        int rem =0;
        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            num/=10;
        }
        return rev;
    }
    static boolean isPalindrome(int num){
        return num==reverseNumber(num);
    }
    static int findGCD(int num1, int num2){
        
        while (num2!=0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num1;
    }
    static boolean isArmstrong(int num){
        int sum=0;
        int n = num;
        int digits = countDigits(num);
        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem,digits);
            n/=10;
        }
        return sum==num;
    }
    static void printDivisors(int num){
        for(int i =1; i<=num; i++){
            if(num%i == 0){
                System.out.print(i+",");
            }
        }
    }
    static boolean isPrime(int num){
        
        if(num<=1){
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for(int i=2; i<=sqrt; i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
