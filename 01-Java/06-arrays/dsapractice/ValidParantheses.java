package dsapractice;
public class ValidParantheses {
    public static void main(String[] args) {
        /*
         * Given a string s containing just the characters '(', ')', '{', '}', '[' and
         * ']', determine if the input string is valid.
         * 
         * An input string is valid if:
         * 
         * - Open brackets must be closed by the same type of brackets.
         * - Open brackets must be closed in the correct order.
         * - Every close bracket has a corresponding open bracket of the same type.
         */

        // Sol
        /*
         * We can use Stack Class provided by util package but i am using array
         */

        String s = "()[]{{}}";
        System.out.println(isValidParantheses(s));
    }

    static boolean isValidParantheses(String s) {
        // making an array of the size of string
        char[] chArray = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                top++;
                chArray[top] = current;
            }
            else {
            // Edge Case: If stack is empty but we see a closing bracket, it's invalid!
            if (top == -1) {
                return false;
            }

            char topElement = chArray[top];

            // Check if they form a perfect matching pair
            if ((current == ')' && topElement == '(') ||
                (current == ']' && topElement == '[') ||
                (current == '}' && topElement == '{')) {
                top--; // Valid match! POP the opening bracket
            } else {
                return false; // Mismatched brackets (e.g., '( ]')
            }
        }
        }
        return top == -1;
    }
}
