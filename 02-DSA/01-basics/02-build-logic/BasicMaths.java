public class BasicMaths {
    public static void main(String[] args) {
        int num = 1234;

        //1. Count no. of digits
        //System.out.println(countDigits(num));

        //2. Reverse the number
        //System.out.println(reverseNumber(num));

        //3. Is Palindrome
        //int n = 1234321;
        //System.out.println(isPalindrome(n));

        //4. GCD
        int a = 48;
        int b = 18;
        System.out.println(findGCD(a, b));
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
}
