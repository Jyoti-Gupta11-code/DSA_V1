import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void findSubsets(int[] nums, int i,
                            List<Integer> current,
                            List<List<Integer>> result) {

        // Base Case
        if (i == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude current element
        findSubsets(nums, i + 1, current, result);

        // Include current element
        current.add(nums[i]);
        findSubsets(nums, i + 1, current, result);

        // Backtrack
        current.remove(current.size() - 1);
    }
}