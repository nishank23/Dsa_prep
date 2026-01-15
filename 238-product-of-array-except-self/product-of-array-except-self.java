class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int prod = 1;

        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }else{
                prod *= nums[i];
            }
        }
        if(zeroes>1){
            return new int[nums.length];
        }
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(zeroes>0){
                res[i]=nums[i]==0?prod:0;
            }else{
                res[i]=prod/nums[i];
            }
        }
        return res;

    }
}