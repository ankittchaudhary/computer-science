public class Patterns{
    public static void main(String[] args) {
       //print1(4, 8);
       //print11(5);
       //print12(4);
       //print13(5);
       //print14(5);
       //print15(5);
       //print16(5);
       //print17(4);
       //print18(4);
       //print19(5);
       //print20(4);
       //print21(5);
       print22(4);
    }
    static void print1(int rows, int cols){
        for(int i =1; i<=rows; i++){
            for(int j =1; j<=cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void print11(int n){
        int start = 1;
        for(int i =0; i<n; i++){
            if(i%2==0) start =1;
            else start=0;

            for(int j=0; j<=i; j++){
                System.out.print(start+" ");  //first iteration i is 0 and 0%2 will be 0 so start will be 1
                start = 1-start; //now start will be 1-1=0
            }
            System.out.println();
        }
    }
    static void print12(int n){
        int space = 2*(n-1);
        for(int i =1; i<=n; i++){

            //num
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            //space
            for(int j =1; j<=space; j++){
                System.out.print(" ");
            }
             
            //num
            for(int j =i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
            space-=2;
        }
    }
    static void print13(int n){
        int num =1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print(num);
                num+=1;
            }
            System.out.println();
        }
    }
    static void print14(int n){
        
        for(int i=1; i<=n; i++){
            for(char j ='A'; j<'A'+i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    static void print15(int n){
        
        for(int i=n; i>=1; i--){
            for(char j ='A'; j<'A'+i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    static void print16(int n){
        for(char i ='A'; i<'A'+n; i++){
            for(int j ='A'; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void print17(int n){
        for(int i =0; i<n; i++){

            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j =1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j>breakpoint) ch--;
                else ch++;
            }
            //space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void print18(int n){
        for(int i=n+1; i>=0; i--){
            for(int j = 65+i; j<=65+n; j++ ){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    static void print19(int n){
        for(int i =0; i<n; i++ ){
            //*
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            //space
            for(int j =0; j<2*i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=n; j>i; j--){
                System.out.print("*");
            }

            System.out.println();
        }

        //=================
        
        for(int i =1; i<=n; i++){
            //*
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=2*(n-i); j>0; j--){
                System.out.print(" ");
            }
            //*
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            

            System.out.println();
        }
    }
    static void print20(int n){
        for(int i =0; i<=2*n; i++){
            //stars
            int stars =i+1;
            if(i>=n) stars= 2*n-i+1;
            for(int j=0; j<stars; j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*n-(2*i);
            if(i>=n) spaces =2*(i-n);
            for(int j=0; j<spaces; j++){
                System.out.print(" ");
            }

            for(int j=0; j<stars; j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }
    static void print21(int n){
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void print22(int n){
        for(int i =0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top =i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2) -i;
                System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left, right))+" ");
                
            }
            
            System.out.println();
        }
    }
}