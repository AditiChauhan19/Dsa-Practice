import java.util.HashSet;

/*
 *
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Example:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Finds the length of the longest substring without repeating characters.
     * @param s Input string
     * @return Length of the longest substring without duplicates
     */
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int start = 0;   // left pointer of sliding window
        int end = 0;     // right pointer of sliding window
        int size = 0;    // maximum length found

        while (end < s.length()) {
            char c = s.charAt(end);

            // If character already in window, shrink from left
            while (window.contains(c)) {
                window.remove(s.charAt(start));
                start++;
            }

            // Add current character and update max size
            window.add(c);
            size = Math.max(size, end - start + 1);
            end++;
        }

        return size;
    }

    // Test the implementation
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: " + s1 + " -> " + solution.lengthOfLongestSubstring(s1)); // 3
        System.out.println("Input: " + s2 + " -> " + solution.lengthOfLongestSubstring(s2)); // 1
        System.out.println("Input: " + s3 + " -> " + solution.lengthOfLongestSubstring(s3)); // 3
    }
}

