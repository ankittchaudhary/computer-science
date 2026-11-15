import java.util.Scanner;

class Example{
    public static void main(String[] args) {
        // Exception handling

        // int a =5;
        // int b =0;
        // int c = a/b; //will give error
        // System.out.println(c); //will not execute        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println(e);
        }

        //stay unimpacted
        System.out.println("Do more work..");
    }
}