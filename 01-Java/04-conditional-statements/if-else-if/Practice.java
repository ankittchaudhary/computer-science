import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        //1. Find Maximum of three numbers
        // int a = 7;
        // int b = 8;
        // int c = 9;
        // System.out.println(findMaximum(a, b, c));

        //2. Find a number is odd or even
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        //int num = sc.nextInt();
        //checkEvenOdd(num);
        

        //3. Find Grades for given marks
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        printGrades(marks);

        sc.close();

    }

    static int findMaximum(int a, int b, int c){
        int max = a;
        if(b>max) max=b;
        if(c>max) max =c;
        return max;
    }
    static void checkEvenOdd(int n){
        System.out.println(n%2==0? "even": "odd");
    }
    static void printGrades(int marks){
        char grade;
        if(marks>=80 && marks<=100) grade = 'A';
        else if (marks>=65 && marks<=79) grade = 'B';
        else if (marks>=55 && marks <=64) grade = 'C';
        else if (marks>=50 && marks <=54) grade = 'D';
        else grade='F';
        System.out.println(grade);
    }
}
