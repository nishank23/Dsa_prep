class Solution {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        HashMap<Character,Integer> myHashMap = new HashMap<>();
        for(char sc :schar){
            myHashMap.put(sc,myHashMap.getOrDefault(sc,0)+1);
        }
        for(char sc:tchar){
            myHashMap.put(sc,myHashMap.getOrDefault(sc,0)-1);
        }
        for(Character key:myHashMap.keySet()){
            int val = myHashMap.get(key);
            if(val!=0){
                return false;
            }
        }
        return true;


    }
}