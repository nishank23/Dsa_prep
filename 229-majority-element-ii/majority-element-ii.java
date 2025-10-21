class Solution {
      public List<Integer> majorityElement(int[] nums) {
        List<Integer> myElements  = new ArrayList<>();
        HashMap<Integer , Integer > hashMap = new HashMap<>();
        int freq = nums.length / 3;
       
        for(int num :nums){
            hashMap.put(num,(hashMap.getOrDefault(num,0))+1);
        }
        for(Integer key : hashMap.keySet()){
            int val = hashMap.get(key);
            if(val>freq){
                myElements.add(key);
            }
        }


        return myElements;
    }
}