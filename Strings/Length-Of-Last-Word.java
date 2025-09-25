/**
 *
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 * 
 * A word is defined as a maximal substring consisting of non-space characters only.
 *
 * Example:
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 */
public class LengthOfLastWord {

    /**
     * Finds the length of the last word in a given string.
     * @param s Input string containing words and spaces
     * @return Length of the last word
     */
    public int lengthOfLastWord(String s) {
        int index = s.length() - 1; // start from last character
        int length = 0;

        // Step 1: Skip trailing spaces
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        // Step 2: Count characters of the last word
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }

    // Test the implementation
    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Input: \"" + s1 + "\" -> " + solution.lengthOfLastWord(s1)); // 5
        System.out.println("Input: \"" + s2 + "\" -> " + solution.lengthOfLastWord(s2)); // 4
        System.out.println("Input: \"" + s3 + "\" -> " + solution.lengthOfLastWord(s3)); // 6
    }
}
