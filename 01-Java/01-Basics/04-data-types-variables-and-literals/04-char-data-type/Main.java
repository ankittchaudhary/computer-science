public class Main {
    public static void main(String[] args) {
        //Char Data Type
        // A B C D E .. A is 65 Z is 90
        // a, b, c .... alphabets , a is 97 and z is 122
        // computer does not support alphabets
        // we use numeric values // called as ASCII // 7bits 0 to 127 

        //128 characters were not enough. Unicode was created to act as a universal dictionary that assigns a unique number (called a Code Point) to every single character in human history.
        // Internet support multiple languages not just english alphabets
        // so we have unicodes like
        // 


        char ascii = 65;
        System.out.println(ascii);


        char hindiLetter = '\u0905';
        System.out.println(hindiLetter);


        //Emojis require 32-bits
        String emoji = "\uD83D\uDE02";
        System.out.println(emoji);
    }
}
