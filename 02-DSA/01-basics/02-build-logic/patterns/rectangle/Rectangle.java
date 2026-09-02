package rectangle;
class Rectangle{
    public static void main(String[] args) {
        // Rectangle Pattern
        /*

        * * * *
        * * * *
        * * * *
        * * * *
        * * * *

        */

        //Print 4x4 rectangle
        printRectangle(5, 4);
    }

    static void printRectangle(int rows, int cols){
        for(int i =1; i<=rows; i++){
            for(int j =1; j<=cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}