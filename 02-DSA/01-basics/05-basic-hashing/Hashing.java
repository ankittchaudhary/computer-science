import java.util.Scanner;

public class Hashing{
    public static void main(String[] args) {
        /*
        Hashing - Precompute + fetch 
        */


        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        // precompute
        int hashArray[] = new int[13];
        for(int i=0; i<n; i++){
            hashArray[arr[i]] +=1;
        }

        // count of numbers we want to count for
        int q;
        q = sc.nextInt();
        while(q>0){
            //number to fetch
            int number;
            number = sc.nextInt();
            //fetch
            System.out.println(hashArray[number]);
            q--;
        }




        sc.close();
    }
}