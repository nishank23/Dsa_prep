class Solution {
        public void sortColors(int[] nums) {
        int[] count = {0,0,0};
        for(int num:nums){
            count[num] = count[num] + 1; 
        }
        int i = 0 ;
        
        for(int j = 0 ;j<count.length;j++){
            for(int k = 0 ; k<count[j];k++){
                nums[i] = j;
                i++;
            }
        }
    }
}