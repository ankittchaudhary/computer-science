import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
    static FileInputStream fi;
    static Scanner sc;

    // traditional
    static void Divide() throws FileNotFoundException, IOException {
        fi = new FileInputStream("demo.txt"); // 50 40 0 30 10

        try {
            sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(a / b);
            System.out.println(a / c); // creating exception divide by 0 , it will not close fi and sc when error occur
        } finally {
            fi.close();
            sc.close();
        }

        // fi.close();
        // sc.close();
    }

    //modern appraoch: try with resources, no need of finally automatically closed
    static void divide1() throws FileNotFoundException, IOException{
        try(FileInputStream f = new FileInputStream("demo.txt"); Scanner s = new Scanner(f);){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            System.out.println(a/c);
        }
    }

    public static void main(String[] args) throws Exception {
        // // throw with resouces
        // try {
        //     Divide();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        // // after the exception we can still access the resources as a/c causes exception
        // // and fi.close and si.close didnt closed, either we can use finally block, or
        // // we have new feature called Try with resources, and by that sc will be closed and we cant read the below data
        // int x = sc.nextInt(); // as sc was closed cant read, but if scanner is not closed we can read as it is
        //                       // connectd to file
        // System.out.println(x);

        //try with resource demo
        try{
            divide1();
        } catch (Exception e){
            System.out.println(e);
        }
    }   
}
