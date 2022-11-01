package org.nemnous.problems;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateSol4 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean ret = set.add(num);
            if (!ret) {
                return true;
            }
        }
        return false;
    }
}
