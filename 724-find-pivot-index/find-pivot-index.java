class Solution {
    public int pivotIndex(int[] nums) {
       for(int j = 0 ;j<nums.length;j++){
            int leftSum = 0;
            int rightSum = 0;
            for(int i =0;i<j;i++){
                leftSum = leftSum + nums[i];
            }
            for(int i =j+1;i<nums.length;i++){
                rightSum = rightSum + nums[i];
            }
            if(leftSum == rightSum){
                return j;
            }
        }
        return -1;
    }
}