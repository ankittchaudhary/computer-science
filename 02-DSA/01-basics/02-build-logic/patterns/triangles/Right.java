package triangles;
public class Right {
    public static void main(String[] args) {
        // Print Right Triangle
        /*
        // 1. Right Star
        * 
        * *
        * * *
        * * * *
        * * * * *
        
        // 2. Numbered
        1 
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        // 3.Repeat row
        1 
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

        */

        int n=5;
        printStar(n);
        printNumbered(n);
        repeatRow(n);
    }

    static void printStar(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printNumbered(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    static void repeatRow(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
