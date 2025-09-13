class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;



    }
}





/*
        Arrays.sort(nums);
        int first = nums[0];
        for(int i =1;i<nums.length;i++){    
            if(first==nums[i])
                return true;
            else
                first = nums[i];    


        }
        return false;
*/        