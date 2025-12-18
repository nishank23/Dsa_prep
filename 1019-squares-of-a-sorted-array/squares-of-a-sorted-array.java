class Solution {
    public int[] sortedSquares(int[] nums) {
        int i =0;
        int j =nums.length-1;
        int r = j;
        int ans[] = new int[r+1];
        while(r>=0){
            int s1= nums[i] * nums[i];
            int s2= nums[j] * nums[j];

            if(s2>s1){
                ans[r] = s2;
                j--;
            }else{
                ans[r] = s1;
                i++;
            }
            r--;


        }
        return ans;
    }
}