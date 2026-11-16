import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ExceptionTypes{


    //Uncheckhed: 
    static void fun1(){
        //System.out.println(10/0); //intentionaly, compiler does not check, program will compile but give error at runtime

        //now handle it
        // try{
        //     System.out.println(10/0);
        // } catch(Exception e){ //Excepltion class is mother
        //     //methods
            
        //     System.out.println(e.getMessage()); //just message
        //     //e.printStackTrace(); //gives complete report
        // }

        //checked exception
        //FileInputStream fi = new FileInputStream("my.txt"); //giving error, and will not compile , as file not found , we must handle it

        try{
            FileInputStream fi = new FileInputStream("my.txt");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    static void fun2(){
        fun1();
    }

    static void fun3(){
        fun2();
    }

    //=======UEND====
    public static void main(String[] args) {
        /*
        Types of exception
        - Checked : mandatory to handle using try catch blocks
        - Unchecked: not mandatory to handle
        */

        // Unchecked U0
        fun3();
    }
}