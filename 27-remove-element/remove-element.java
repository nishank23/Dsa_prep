class Solution {
    public int removeElement(int[] nums, int val) {
       int n =nums.length;
       int k =0;
       for(int i = 0;i<n;i++){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
       }
       return k;
    }
}

/*
int k =0;
        int i =0;
        int n = nums.length;
        while(i<n){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;


*/        