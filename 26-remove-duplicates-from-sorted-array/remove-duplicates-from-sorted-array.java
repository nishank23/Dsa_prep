class Solution {
    public int removeDuplicates(int[] nums) {
         int i = 1;
         int n = nums.length;
         int k = 1;
         while(i<n){
            if(nums[i]!=nums[k-1]){

                nums[k] = nums[i];
                k++;    
            }
            i++;
         }
        return k;

    }
}
/*
int i = 1;
         int n =nums.length;   
         int k = 1;
         while(i<n){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;    
            }    
            i++;
         }
         return k;

*/         