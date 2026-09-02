package triangles;

public class Equilateral{
    public static void main(String[] args) {
        /* 1.
        
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *

        */

        // 2.Inverted
        /*

        * * * * * * * * * 
          * * * * * * * 
            * * * * * 
              * * * 
                * 
        
        visually: 
        spaces stars spaces
          0      9      0
          1      7      1
          2      5      2
          3      3      3
          4      1      1
        
        */

        //3.
        /*
         
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
        * * * * * * * * * 
          * * * * * * * 
            * * * * * 
              * * * 
                * 
        

        4. 

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        * 

        */

        //1.
        //print(5);
        
        //2.
        //printInverted(5);

        //3rd
        //print(5);
        //printInverted(5);

        //4.
        print4(5);


    }

    static void print(int n){
        for(int i =0; i<n; i++){
            // space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }

            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void printInverted(int n){
        for(int i=0; i<n; i++){
            //spaces
            for(int j =0; j<i; j++ ){
                System.out.print(" ");
            }

            //stars
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }  
            
            for(int j =0; j<i; j++ ){
                System.out.print(" ");
            }

            System.out.println();
        }

    }


    //4.
    static void print4(int n){
        for(int i =0; i<2*n-1; i++){
            int stars =i+1;
            if(i>=n) stars= 2*n-1-i;
            
            for(int j=0; j<stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}