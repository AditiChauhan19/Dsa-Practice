/**
 * 
 * Given an integer array nums and an integer val, 
 * remove all occurrences of val in nums in-place. 
 * The order of elements may be changed. 
 * Return the number of elements which are not equal to val.
 * 
 * Example:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 */

public class RemoveElement {

    /**
     * Removes all occurrences of val from the array in-place.
     * @param nums The input array
     * @param val The value to remove
     * @return The new length of the array after removal
     */
    public int removeElement(int[] nums, int val) {
        int k = 0; // pointer for the position to overwrite

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // move the valid element to the front
                k++;
            }
        }

        return k; // number of elements not equal to val
    }

    // Test the implementation
    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3, 2, 2, 3, 4, 3};
        int val = 3;

        int newLength = solution.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
