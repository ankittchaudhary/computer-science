public class Main {
    public static void main(String[] args) {
        //String Objects
        String str = "Java";

        //1. length //returns int
        System.out.println(str.length());//4

        //2. toLowerCase
        System.out.println(str.toLowerCase()); //java  new obj is create to which str refers to now

        //3. toUpperCase
        System.out.println(str.toUpperCase()); //JAVA

        //4. trim //removes leading and tailing blank spaces
        String str1 = "    Java   ";
        System.out.println(str1.trim()); //Java //new obj will be created

        //5. substring (int begin, int end)
        String str2 = "Welcome";
        //             0123456
        System.out.println(str2.substring(2)); //lcome
        System.out.println(str2.substring(1,5)); //elco

        //6. replace(char old, char new)  //replace every old char with new char  //gives new string
        String str3 = "Welcomr";
        str3 = str3.replace('r', 'e');
        System.out.println(str3); //Welcome

        //7. startsWith(String s) //returns true/false
        String website = "www.findmyinstitute.com";

        boolean res = website.startsWith("www.");
        System.out.println(res); //true

        //8. endsWith
        boolean isEndWithDotCom = website.endsWith(".com");
        System.out.println(isEndWithDotCom); //true

        //9. charAt(int index) //returns the character at asked index
        String str5 = "Java";
        //             0123
        System.out.println(str5.charAt(3)); //a

        //10. int indexOf(String s) //first occurance
        System.out.println(str5.indexOf('a')); //1

        //11. lastIndexOf(String s) //checks from last
        System.out.println(str5.lastIndexOf('a')); //3

        //12. boolean equals(String s)
        String ab ="abcd";
        String abc = new String("abcd");
        String cd = "abcd";
        String ef = "Abcd";
        System.out.println(ab.equals(cd)); //true
        System.out.println(ab.equals(ef)); //false //case diff.

        System.out.println(ab==abc); //false //ref. are checked both points to two diff literals
        System.out.println(ab.equals(abc)); //true because now values are checked and here are same

        //13. boolean equalsIgnoreCase(String s)
        System.out.println(ab.equalsIgnoreCase(ef)); //true

        //14. int compareTo(String s) -> compare lexicographically returns the difference
        System.out.println(ab.compareTo(ef)); //32
        //a=97 and A=65: 32, as rest all are same

        //15. contains
        String str9 = "Google's CEO is Sundar Pichai";
        System.out.println(str9.contains("Sundar")); //true, case sensitive

        //16. valueOf
        System.out.println(String.valueOf("97")); //97

    }
}
