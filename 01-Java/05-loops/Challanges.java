import java.util.Scanner;

public class Challanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //1. Multiplication Table
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // printTable(num);

        //2. Find sum of n numbers
        // System.out.print("How many numbers you want to sum: ");
        // int nums = sc.nextInt();
        // int sum=0;
        // for(int i =1; i<=nums; i++){
        //     System.out.printf("Enter number %d: ", i);
        //     int num = sc.nextInt();
        //     sum+=num;
        // }
        // System.out.printf("Sum is %d", sum);

        //3. Factorial
        System.out.print("Enter the number to find its factorial: ");
        //fact = n*(n-1)
        int num = sc.nextInt();
        System.out.println(findFactorial(num));

        sc.close();
    }


    //1.
    static  void printTable(int n){
        for(int i =1; i<=10; i++){
            System.out.printf("%d x %d = %d\n", n, i, i*n);
        }
    }

    //3. Factorial
    static int findFactorial(int n){
        int fact =1;
        if(n==0 || n==1) fact =1;
        for(int i =1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
}
