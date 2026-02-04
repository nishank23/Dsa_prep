class Solution {
    public int search(int[] nums, int target) {
         int l = 0;
         int r = nums.length-1;
         while(l<r){
            int mid =(r+l)/2;
            if(nums[mid]>nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
         }
         int pivot = l;


         int result = binarySearch(nums,target,0,pivot-1);
         if(result!=-1){
            return result;
         }
         return binarySearch(nums,target,pivot,nums.length-1);
    }

    public int binarySearch(int[] nums,int target,int left,int right){
        while(left<=right){
            int mid = (right+left)/2;
            if(nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                return mid;
            }

        }
        return -1;
        
    }

}
