class Solution {
     public double findMaxAverage(int[] nums, int k) {
        // [1,12,-5,-6,50,3], k = 4
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        int bestSum = currSum;
        for(int i = k ;i<nums.length;i++){
            currSum = currSum - nums[i-k] + nums[i];
            if(currSum>bestSum){
                bestSum= currSum;
            }
        }
        return (double) bestSum/k;
    }
}