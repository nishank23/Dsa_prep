class Solution {

    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        for(int num:nums){
            myHashMap.put(num,myHashMap.getOrDefault(num,0)+1);
        }
        int value = 0;
        int nkey = 0;
        for(int key : myHashMap.keySet()){
            int val = myHashMap.get(key);
            if(val>value){
                value=val;
                nkey = key;
            }


        }
        return nkey;



        
    }
}
