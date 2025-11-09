class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> myHashmap = new HashMap<>();


        for(int num : nums){
            myHashmap.put(num,(myHashmap.getOrDefault(num,0))+1);
        }

        for(int key : myHashmap.keySet()){
            int val = myHashmap.get(key);
            if(val==1){
                return key;
            }
        }



        return nums[0];
     
    }
}