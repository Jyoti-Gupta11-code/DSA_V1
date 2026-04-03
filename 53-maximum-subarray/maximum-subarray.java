class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];      // current subarray sum
        int maxSum = nums[0];   // maximum sum found so far

        for (int i = 1; i < nums.length; i++) {
            if (sum >= 0)
                sum = sum + nums[i];   // extend the current subarray
            else
                sum = nums[i];          // start a new subarray

            if (sum > maxSum)
                maxSum = sum;           // update the max sum
        }
        return maxSum;
    }
}
