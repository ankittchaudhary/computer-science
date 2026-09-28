package challanges;

public class Main {
    public static void main(String[] args) {
        //Challenge: 3

        //1. Remove Special Characters from a string
        String str1 = "&8A!*(n^$$k%&*i899789t";
        System.out.println(removeSpecialCharacters(str1));
        System.out.println(removeSpecialCharactersAndNum(str1));

        //2. Remove Extra spaces from string
        String str = "    My Name     is Ankit    ";
        System.out.println(removeSpaces(str));


        //3. Find number of words in a string
        String sentence = "My Name is Ankit"; 
        //System.out.println(countSpaces(sentence));  //way 1
        System.out.println(countWords(sentence));

    }

    //1. remove Special characters from the string
    static String removeSpecialCharacters(String s){
        return s.replaceAll("[^a-zA-Z0-9\\s]", "");
    }

    static String removeSpecialCharactersAndNum(String s){
        String str = removeSpecialCharacters(s);
        return str.replaceAll("[0-9]", "");
    }
    //2. Remove Extra spaces and return string
    static String removeSpaces(String s){
        if (s.trim().isEmpty()) return "Error: String is Empty";
        return s.replaceAll("\\s+", " ").trim();
    }


    //3.1 Indirect Way
    static int countSpaces(String str){
        int count = 0;
        String s =removeSpaces(str); //reusability

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)== ' '){
                count++;
            }
        }
        return count+1;
    }
    //3.2 Direct Way
    static int countWords(String s){
        if(s.trim().isEmpty()) return 0;
        return s.split(" ").length;
    }

}
