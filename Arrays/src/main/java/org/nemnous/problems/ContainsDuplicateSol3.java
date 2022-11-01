package org.nemnous.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Using HashSet and comparing the size
 * Complexity O(N)
 */
public class ContainsDuplicateSol3 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        Set<Integer> hashSet = new HashSet<>();
        // add() to hash set is O(1) for N elements it's O(N)
        for (int num : nums) {
            hashSet.add(num);
        }
        return hashSet.size() != nums.length;
    }
}
