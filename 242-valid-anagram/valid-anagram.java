class Solution {
    public boolean isAnagram(String s, String t) {
        
        // char[] s1 =  s.toCharArray();
        // char[] s2 =  t.toCharArray();

        // Arrays.sort(s1);
        // Arrays.sort(s2);
        // return Arrays.equals(s1, s2);

        HashMap<Character,Integer> sHashMap = new HashMap<>();

        for(char c:s.toCharArray()){
            sHashMap.put(c,(sHashMap.getOrDefault(c,0))+1);
        }
        for(char c:t.toCharArray()){
            sHashMap.put(c,(sHashMap.getOrDefault(c,0))-1);
        }
        for(Integer val:sHashMap.values()){
            if(val!=0){
                return false;
            }
        }
        return true;


    }
}