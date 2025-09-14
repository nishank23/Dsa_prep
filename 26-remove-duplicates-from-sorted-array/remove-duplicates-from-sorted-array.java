class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int n = nums.length;
    
        for(int i =1;i<n;i++){
            if(nums[i]!=nums[k-1]){
                int temp = nums[k]; 
                nums[k] = nums[i];
                nums[i] = temp;
                k++;    
            }
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