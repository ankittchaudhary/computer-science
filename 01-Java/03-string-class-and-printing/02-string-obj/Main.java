public class Main{
    public static void main(String[] args) {
        //String objects

        String str1 = "Java"; //created in pool
        //              |
        //            literal creted in pool
        System.out.println(str1);

        String str2 = "Java"; //points to same "Java" obj created above in pool and no new obj will be created as both are as it is same


        //using String constructor
        String str3 = new String("Java"); //here new "Java" obj is created in heap and str3 also points to above created "Java" obj in pool

        // 
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        //           0    1    2    3    4
        String str4 = new String(c, 0,2); //3 parameters character array, starting index or offset and count [no of characters you want]
        System.out.println(str4); //He

        //using byte array
        byte b[] = {65, 66, 67, 68, 69, 70};
        String str5 = new String(b);
        //                   |
        //                constructor: a method having same name as class name.
        System.out.println(str5); //ABCDEF
    }
}