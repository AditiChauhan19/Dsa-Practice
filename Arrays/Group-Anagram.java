import java.util.*;

/**
 *
 * Given an array of strings strs, group the anagrams together. 
 * You can return the answer in any order.
 *
 * Example:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

public class GroupAnagrams {

    /**
     * Groups anagrams from the given array of strings.
     * @param strs Input array of strings
     * @return List of grouped anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and list of anagrams as value
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);            // sort characters to form key
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>()); // initialize list if key not present
            map.get(key).add(word);                  // add original word to list
        }

        return new ArrayList<>(map.values()); // return all grouped anagrams
    }

    // Test the implementation
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> groupedAnagrams = solution.groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}
