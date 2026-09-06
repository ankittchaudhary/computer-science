import java.util.Scanner;

public class Challanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Multiplication Table
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // printTable(num);

        // 2. Find sum of n numbers
        // System.out.print("How many numbers you want to sum: ");
        // int nums = sc.nextInt();
        // int sum=0;
        // for(int i =1; i<=nums; i++){
        // System.out.printf("Enter number %d: ", i);
        // int num = sc.nextInt();
        // sum+=num;
        // }
        // System.out.printf("Sum is %d", sum);

        // 3. Factorial
        // System.out.print("Enter the number to find its factorial: ");
        // int num = sc.nextInt();
        // System.out.println(findFactorial(num));

        // 4. Display Digits of a number
        // int num = 762490;
        // displayDigits(num);
        // countDigits(num);
        // System.out.println(countDigitsUsingLog(num));

        // 5. check if num is armstrong or not: sum of its own digits, where each digit
        // is raised to the power of the total number of digits
        // int num =153;
        // System.out.println(isArmstrong(num));

        // 5. find armstrong nums that exists under 1000
        // int limit = 500;
        // findArmstrongNums(limit);

        // 6. reverse the number
        // int num = 1234;
        // System.out.println(reverseNum(num));

        // 7. check if num is palindrome: means looks same from both left and right side
        // int num = 12321;
        // System.out.println(isPalindrome(num));

        //8. Display number in words
        //eg. 123 = One Two Three
        // eg: 1700 = One Seven Zero Zero
        // int num = 12300;
        // displayWords(num);

        //9. Display Arithmetic Progression
        int limit = 5;
        int commonDifference = 3;
        displayAP(limit, commonDifference);
        sc.close();
    }

    // 1.
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, i * n);
        }
    }

    // 3. Factorial
    static int findFactorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1)
            fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 4
    static void displayDigits(int num) {
        if (num == 0) {
            System.out.println(num);
        }
        int r;
        while (num > 0) {
            r = num % 10;
            num /= 10;
            System.out.print(r);

        }
    }

    static void countDigits(int num) {
        // O(log10 N)
        int absNum = Math.abs(num);
        if (absNum == 0) {
            System.out.println(1);
            return;
        }
        int count = 0;
        while (absNum > 0) {
            absNum /= 10;
            count++;
        }
        System.out.println(count);
    }

    static int countDigitsUsingLog(int num) {
        // this gives O(1)
        if (num == 0) return 1;
        long absNum = Math.abs((long) num);
        return (int) Math.log10(absNum) + 1;
    }

    static boolean isArmstrong(int num) {
        // 1. we need to count digits
        int digits = countDigitsUsingLog(num);

        // 2. persist original num
        int originalNum = num;
        int rem = 0;
        int tempNum = 0;

        while (num > 0) {
            rem = num % 10;
            tempNum = tempNum + (int) Math.pow(rem, digits);
            num /= 10;
        }

        return tempNum == originalNum;
    }

    static void findArmstrongNums(int limit) {
        if (limit < 1) {
            System.out.println("Please enter a limit greater than or equal to 1.");
            return;
        }
        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static int reverseNum(int num) {
        int absNum = Math.abs(num);
        if (absNum < 10) {
            return absNum;
        }
        int rev = 0;
        while (absNum != 0) {
            int lastDigit = absNum % 10;
            rev = rev * 10 + lastDigit;
            absNum /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int num){
        return num==reverseNum(num);
    }

    static void displayWords(int num) {
    if (num == 0) {
        System.out.print("Zero");
        return;
    }

    // 1. Get the exact digit count of the original number
    int totalDigits = countDigitsUsingLog(num); 
    
    // 2. Reverse the number
    int reversed = reverseNum(num);
    int digitsPrinted = 0;

    // 3. Loop strictly while reversed > 0
    while (reversed > 0) {
        int rem = reversed % 10;
        switch (rem) {
            case 0 -> System.out.print("Zero ");
            case 1 -> System.out.print("One ");
            case 2 -> System.out.print("Two ");
            case 3 -> System.out.print("Three ");
            case 4 -> System.out.print("Four ");
            case 5 -> System.out.print("Five ");
            case 6 -> System.out.print("Six ");
            case 7 -> System.out.print("Seven ");
            case 8 -> System.out.print("Eight ");
            case 9 -> System.out.print("Nine ");
        }
        reversed /= 10;
        digitsPrinted++;
    }

    // 4. Handle trailing zeros (e.g., if num was 120, reversed was 21, we still need 1 more zero)
    while (digitsPrinted < totalDigits) {
        System.out.print("Zero ");
        digitsPrinted++;
    }
}

    static void displayAP(int limit, int difference){
        int firstTerm = difference-1;
        
        for(int i =limit; i>0; i--){
            System.out.print(firstTerm+(limit-i)*difference);
            System.out.print(" ");
        }
    }
}
