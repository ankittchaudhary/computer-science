public class Quantifiers {
    public static void main(String[] args) {
        // Quanitifiers allow multiple symbols check
        /*

        * -> o or more times
        + -> 1 or more times
        ? -> 0 or 1 time
        {X} -> X time
        {Y} -> Y time
        
        */

        // * 
        String str1 = "abhcahdbabhb237e*^*";
        //System.out.println(str1.matches(".*")); //true as . means any character and * means any no. of time

        //+ is same as * but here atleast 1 time
        //? same but 0 or 1 time

        // {X} 
        String str2 = "abc";
        System.out.println(str2.matches("[abc]{3}")); //true
        System.out.println(str2.matches("[abc]{5}")); //false as str is only 3 times

        System.out.println(str2.matches("[abcde]{3}")); //true as char can be any from a,b,c,d or e and 3 times which is true for str2

        System.out.println(str2.matches("[abc]{2,5}")); //true as str2 is in range 2 to 5 and also chars are from regex so true

    }
    
}
