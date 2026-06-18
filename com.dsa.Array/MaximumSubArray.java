class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int max_so_far = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            max_so_far = Math.max(max_so_far, currMax);
        }
        return max_so_far;
    }
}