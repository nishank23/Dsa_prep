class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int bestSum = 0;
        int currentSum = 0;

        int n =nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i =0;i<k;i++){
            currentSum = currentSum+nums[i];
        }
        bestSum = currentSum;
        for(int i = k ;i<n;i++){
            currentSum = currentSum - nums[i-k] + nums[i];
            if(currentSum>bestSum){
                bestSum = currentSum;
            }
        }

        

        return (double) bestSum/k; 
    }
}