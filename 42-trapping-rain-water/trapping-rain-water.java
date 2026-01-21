class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==1){
            return 0;
        }
        int l = 0 ,r = n-1;
        int leftMax = height[0];
        int rightMax = height[n-1];
        int water =0;
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);
                water += leftMax-height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax,height[r]);
                water += rightMax-height[r];
            }
        }
        
        return water;

    }
}