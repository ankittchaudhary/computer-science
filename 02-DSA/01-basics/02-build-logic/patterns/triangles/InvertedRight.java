package triangles;
public class InvertedRight {
    public static void main(String[] args) {
        // Print Right Triangle
        /*
        //Stars
        * * * * *
        * * * *
        * * *
        * *
        * 
        
        // Print nums
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
       //printStars(5);
       printNums(5);
    }

    static void printStars(int n){
        for(int i =n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printNums(int n){
        for(int i =n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
