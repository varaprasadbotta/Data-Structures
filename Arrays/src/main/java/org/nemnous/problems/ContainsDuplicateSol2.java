package org.nemnous.problems;

import java.util.Arrays;

/**
 * Sorting followed by Linear search
 * complexity O(NlogN) + O(N) = O(NlogN)
 */
public class ContainsDuplicateSol2 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        // Complexity to sort array NlogN
        Arrays.sort(nums);
        //Linear search
        //Complexity to linear search N
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
