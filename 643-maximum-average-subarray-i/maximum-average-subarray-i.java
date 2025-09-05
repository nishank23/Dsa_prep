class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int bestSum = Integer.MIN_VALUE;
        int start = 0;
        int end = k-1;
        int n =nums.length;
        if(n==1){
            return nums[0];
        }
        while(end <n){
            int temp =0;
            for(int i =start;i<=end;i++){
                temp = temp+nums[i];
            }
            if(bestSum<temp){
                bestSum = temp;
            }

            start++;
            end++;
        }


        return (double) bestSum/k; 
    }
}