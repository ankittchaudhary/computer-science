package challanges;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //1. Find radix of a given number in string
        // System.out.print("Enter a number: ");
        // String num = s.next();
        // findRadix(num);

        //2. Find if Given year is leap
        // System.out.print("Enter year: ");
        // if (s.hasNext("[1-2][0-9]{3}")) {
        //     String year = s.next("[1-2][0-9]{3}");
        //     System.out.println(isLeapYear(year) ? "Leap Year" : "Not a leap year");
        // } else {
        //     System.out.println("Invalid year format! Please enter a 4-digit year between 1000 and 2999.");
        // }

        //3. Find type of website and protocol used
        // https://www.google.com
        //   |      |     |    |________ TDL
        //protocol  |   Second-Level Domain (SLD)
        //         subdomain
        System.out.print("Enter Website URL: ");
        String url = s.next();
        extractURL(url);

        s.close();
    }

    static void findRadix(String s){
        
        if(s.matches("[01]+")) System.out.println("Binary (2)");
        else if (s.matches("[0-7]+")) System.out.println("Octal (8)");
        else if (s.matches("[0-9]+")) System.out.println("Decimal (10)");
        else if (s.matches("[0-9A-F]+")) System.out.println("Hexa-Decimal (16)");
        else System.out.println("Invalid Number");

        
    }
    static boolean isLeapYear(String year){
        int yearInt = Integer.parseInt(year);
        return (yearInt % 4 ==0 && yearInt % 100!=0) || (yearInt % 400 ==0);
    }
    static void extractURL(String url){
        String protocol = url.substring(0, url.indexOf(":"));
        String TDL = url.substring(url.lastIndexOf(".")+1);

        if(protocol.equalsIgnoreCase("https")) System.out.println("Hyper Text Transfer Protocol");
        else if (protocol.equalsIgnoreCase("ftp")) System.out.println("File Transfer Protocol");

        

        if(TDL.equalsIgnoreCase("com")) System.out.println("commercial");
    }
}
