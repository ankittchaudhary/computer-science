import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        c =  a+b;
        System.out.printf("Sum of %d and %d is %d", a, b, c); //printf is used for formatter output
        sc.close(); //good practice
    }
}


/*
- %d for interger
- %s for string
- %f for float
- %.1f for one digit after point
- %n for nextline
*/