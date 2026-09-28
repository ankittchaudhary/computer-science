package challanges;

public class Two {
    public static void main(String[] args) {
        //Challenge 2 : Regular Expressions

        //1. Find if a Number is binary or not
        //2. Find if a Number is Hexa-Decimal or not
        //3. Find if the data is in Date format (dd/mm/yyyy)

        //1.
        int num = 101101100; // we can convert it to string and we have regex for strings
        String str = String.valueOf(num);
        isBinary(str);

        //2.
        String hexDec = "067ABC"; //0-9A-F
        isHexaDecimal(hexDec);

        //3. Date dd/mm/yyyy
        String data = "29/07/2005";
        isDate(data);

    }

    static void isBinary(String s){
        System.out.println(s.matches("[01]+") ? "Num is binary" : "Not Binary");
    }

    static void isHexaDecimal(String s){
        System.out.println(s.matches("[0-9A-F]+") ? "Hexa-Decimal": "Not HexaDecimal");
    }

    static void isDate(String s){
        System.out.println(s.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
    
}