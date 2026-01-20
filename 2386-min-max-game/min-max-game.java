class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length != 1) {
            nums = minMax(nums); 
        }
        return nums[0];
        
    }
    private int[] minMax(int[] nums){
        if(nums.length==1){
            return nums;
        }

        int n = nums.length;
        boolean isLastMin = false;
        int[] newArr = new int[n/2];
        int j=0;
        for(int i =0;i<n;i=i+2){
            if(!isLastMin){
                newArr[j] = Math.min(nums[i],nums[i+1]);
                isLastMin = true;
            }else{
                newArr[j] = Math.max(nums[i],nums[i+1]);
                isLastMin = false;
            }
            j++;
        }
        return newArr;
    }
}