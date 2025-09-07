class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int [nums.length];
        int n = nums.length;
        int r = n-1;
        int i =0;
        int j = n-1;
        while(r>=0){
        int sq1 = nums[i]*nums[i];
        int sq2 = nums[j]*nums[j];
        if(sq1>sq2){
            ans[r] = sq1;
            i++;
        }else{
            ans[r] = sq2;
            j--;
        }
        r--;    
        }



        return ans;
    }
}


/*
 int i =0;
       int n = nums.length;
       int j =n-1;
       int[] ans = new int[n];
       int r = n-1;
       while(r>=0){
           int sq1 = nums[i]*nums[i];
           int sq2 = nums[j]*nums[j];

            if(sq1>sq2){  
                ans[r] = sq1;
                i++;
            }else{
                ans[r] = sq2;
                j--;
            }
            r--;
            // if(i==j){
            //     ans[r]=(int) Math.pow(nums[i],2);
            // }

       }
       return ans;


*/
