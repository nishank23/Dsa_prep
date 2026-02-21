class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> myMap =new HashMap<>();
        for(int i :nums){
            myMap.put(i,myMap.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> keyMap = new ArrayList<>(myMap.keySet());

        keyMap.sort((a,b) -> myMap.get(b) - myMap.get(a));

        int[] res = new int[k];
        for(int i =0;i<k;i++){
            res[i] = keyMap.get(i);
        }
        return res;





    }
}