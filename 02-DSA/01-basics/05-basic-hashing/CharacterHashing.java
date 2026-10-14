import java.util.Scanner;

public class CharacterHashing{
    public static void main(String[] args) {
        /*
        Character Hasing:
        ex: abcabccaad
        how many times c occur??
        */

        //take input string of characters
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter string of characters: ");
        String str = sc.next();    //abcccabc

        //compute
        int hashArray[] = new int[26]; //stores the frequencies an item occur
        for(int i=0; i<str.length(); i++){
            hashArray[str.charAt(i) -'a']++;    
        }
        

        //take input queries
        int queries;
        System.out.print("For how many characters you want to count for: ");
        queries = sc.nextInt(); //eg. query for 2 charcters so 2
        while(queries>0){
            //input characters
            int c;
            System.out.print("Enter char: ");
            c=sc.next().charAt(0);
            System.out.println("Frequency of "+ (char)c + " is "+hashArray[c-'a']);

            queries--;
        }

        sc.close();
    }
}