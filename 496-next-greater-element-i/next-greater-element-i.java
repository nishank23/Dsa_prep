class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int i =0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]!=nums2[j]){
                j++;
            }else{
                int k = j+1;
                while(k<nums2.length && nums2[j]>nums2[k]){
                    k++;
                }
                if(k!=nums2.length){
                    ans[i]=nums2[k];
                }else{
                    ans[i]=-1;
                }
                
                i++;
                j=0;
            }
        }
        return ans;

    }
}