class Solution {
    public double findMaxAverage(int[] nums, int k) {
           int bestSum = 0;
           int currentSum =0;
           for(int i =0;i<k;i++){
            currentSum = currentSum + nums[i];
           }
           bestSum = currentSum;
           int n =nums.length; 
            for(int i = k;i<n;i++){   

                currentSum = currentSum + nums[i]- nums[i-k];
                if(currentSum>bestSum){
                    bestSum = currentSum;
                }

            }

        
        return (double) bestSum/k;

    }
}





/*
 int bestSum = 0;
        int currentSum = 0;
        int n =nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i =0;i<k;i++){
            currentSum = currentSum+nums[i];
        }
        // for the edge cases if our subarray has n and k is also n then we need to put the value 
        // what if that very first window has largest sum of all 
        bestSum = currentSum;
        for(int i = k ;i<n;i++){
            currentSum = currentSum - nums[i-k] + nums[i];
            if(currentSum>bestSum){
                bestSum = currentSum;
            }
        }

        

        return (double) bestSum/k; 


 */       