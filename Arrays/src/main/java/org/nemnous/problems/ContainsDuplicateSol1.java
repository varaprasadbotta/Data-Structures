package org.nemnous.problems;

/**
 * Brute force.
 *
 * Time complexity: O(N)
 */
public class ContainsDuplicateSol1 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
