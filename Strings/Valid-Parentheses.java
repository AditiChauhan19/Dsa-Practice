import java.util.Stack;

/**
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 *
 * A string is valid if:
 * 1. Open brackets are closed by the same type of brackets.
 * 2. Open brackets are closed in the correct order.
 *
 * Example:
 * Input: s = "()[]{}"
 * Output: true
 */
public class ValidParentheses {

    /**
     * Checks if the given string has valid parentheses.
     * @param s Input string containing parentheses
     * @return true if valid, false otherwise
     */
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // If stack is empty, no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }

                // Check if top of stack matches the current closing bracket
                if ((st.peek() == '(' && ch == ')') ||
                    (st.peek() == '{' && ch == '}') ||
                    (st.peek() == '[' && ch == ']')) {
                    st.pop(); // valid pair, remove from stack
                } else {
                    return false; // invalid pair
                }
            }
        }

        // If stack is empty, all brackets matched
        return st.isEmpty();
    }

    // Test the implementation
    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        
        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "{[()]}";

        System.out.println(s1 + " -> " + solution.isValid(s1)); // true
        System.out.println(s2 + " -> " + solution.isValid(s2)); // false
        System.out.println(s3 + " -> " + solution.isValid(s3)); // true
    }
}
