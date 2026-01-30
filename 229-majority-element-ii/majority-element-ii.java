class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arrList = new ArrayList<>();
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        int n = nums.length;
        for(int num:nums){
            myHashMap.put(num,myHashMap.getOrDefault(num,0)+1);
        }
        for(int key:myHashMap.keySet()){
            int val = myHashMap.get(key);
            if(val > n/3){
                arrList.add(key);
            }
        }
        return arrList;
    }
}