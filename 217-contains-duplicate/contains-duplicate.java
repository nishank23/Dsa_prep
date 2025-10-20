class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i =1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }
        // return false;
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int num:nums){
            if(myMap.containsKey(num)){
                return true;
            }
            myMap.put(num,num);
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