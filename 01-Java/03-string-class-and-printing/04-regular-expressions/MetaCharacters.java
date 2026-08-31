public class MetaCharacters {
    public static void main(String[] args) {
        // Meta Characters



        String str1 = "1";
        //System.out.println(str1.matches("\\d")); //true

        // \D - Not Digits
        String str2 = "a";
        //System.out.println(str2.matches("\\D")); //true as str2 is not a digit

        // \s check fir space
        String str3 = " ";
        //System.out.println(str3.matches("\\s")); //true

        // \S checks not space, so can be anything but space

        // \w checks alphabet or digit
        String str4 = "a"; //1
        //System.out.println(str4.matches("\\w")); //true

        // \W not a digit nor an aphabet
        String str5 = "%";
        System.out.println(str5.matches("\\W")); //true as % is neither alphabet nor digit
    }
}
