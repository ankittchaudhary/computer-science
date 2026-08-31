public class MatchingSymbols {
    public static void main(String[] args) {
        //Regular Expressions are used for defining patterns for strings
        // Define a pattern and check if a string is matching the pattern or not

        //Symbols used
        String str1 = "8"; //f, 7, %, or any single char but abc, ab etc will be false
        //System.out.println(str1.matches(".")); //true
        //                                      |
        //                              Regular Expression

        String str2 = "a"; 
        //System.out.println(str2.matches("[abc]")); //true   NOTE:check only one so if str 2 is a, b, or c then true otherwise false abc will also false

        String str3 = "a";
        //System.out.println(str3.matches("[^abc]")); //false, it means except letters ab, b or c, it can we anything, p, q etc will be true

        String str4 = "j";
        //System.out.println(str4.matches("[a-z0-9]"));// true, takes single char only, 7 will also true % will be false
        
        String str5 = "a7A";
        //System.out.println(str5.matches("[a-z][A-Z][0-9]")); //true now taking three chars but a7A will be false because order is not correct aA7 will be true
        
        String str6 = "p";
        //System.out.println(str6.matches("a|b")); //false either a or b is allowed so str6 should only be a or b

        String str7 = "abc";
        System.out.println(str7.matches("abc")); //should be exactly abc //true
    
    }
}
