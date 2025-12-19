class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> myHashMap = new HashMap<>();
        for(char c:s.toCharArray()){
            myHashMap.put(c,myHashMap.getOrDefault(c,0)+1);
        }
        for(int i =0;i<s.length();i++){
            if(myHashMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;

    }
}