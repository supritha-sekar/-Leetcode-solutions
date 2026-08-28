import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!list.contains(i)) {
                l.add(i);
            }
        }

        return l;
    }
}