/**
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 *
 * Alphanumeric characters include letters and numbers.
 *
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class ValidPalindrome {

    /**
     * Checks whether the given string is a valid palindrome.
     * @param s Input string
     * @return true if palindrome, false otherwise
     */
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters in lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Test the implementation
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println("Input: \"" + s1 + "\" -> " + solution.isPalindrome(s1)); // true
        System.out.println("Input: \"" + s2 + "\" -> " + solution.isPalindrome(s2)); // false
        System.out.println("Input: \"" + s3 + "\" -> " + solution.isPalindrome(s3)); // true
    }
}
