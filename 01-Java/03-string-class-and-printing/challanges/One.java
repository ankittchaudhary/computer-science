package challanges;

public class One {
    public static void main(String[] args) {
        //Challenge 1 : String Methods

        //1. Find if the email id is on gmail
        //2. Separate username and domain name

        String str = "programmer@gmail.com";
        //                      |---------|
        //                        domain

        

        //2. we can find index of @ and then print everything after it
        // We can use indexOf method
        int index = str.indexOf("@");

        String username = str.substring(0, index);
        String domainName = str.substring(index+1);

        System.out.println("Username is "+ username);
        System.out.println("Domain name is " +domainName);

        //1. 
        //int indexOfDot = domainName.indexOf(".");
        boolean isGmail = domainName.startsWith("gmail.");
        System.out.println(isGmail? "yes the domain is gmail": "No");  //yes

    }
}
