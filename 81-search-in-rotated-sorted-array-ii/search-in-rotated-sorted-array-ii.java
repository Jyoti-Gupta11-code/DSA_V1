class Solution {
    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // 1. Found target
            if (nums[mid] == target) {
                return true;
            }

            // 2. If duplicates exist
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            // 3. Left half sorted
            else if (nums[start] <= nums[mid]) {

                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // 4. Right half sorted
            else {

                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false ;
    }
}