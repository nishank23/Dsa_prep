class Solution {
    public int pivotIndex(int[] nums) {
       int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum - nums[i]) {
                return i;
            }
            leftSum = leftSum + nums[i];
            rightSum = rightSum - nums[i];

        }
        return -1;
    }
}