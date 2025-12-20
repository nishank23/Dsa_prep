class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> pHashMap = new HashMap<>();
        HashMap<String,Character> sHashMap = new HashMap<>();
        
        String[] strings = s.split(" ");
        if(strings.length!=pattern.length()){
            return false;
        }
        
        for(int i =0;i<strings.length;i++){

            char c = pattern.charAt(i);
            String sc = strings[i];


            if(pHashMap.containsKey(c) && !pHashMap.get(c).equals(sc)){
                return false;
            }
            if(sHashMap.containsKey(sc) && !sHashMap.get(sc).equals(c)){
                return false;
            }

            pHashMap.put(c,sc);
            sHashMap.put(sc,c);
        }
        return true;




    }
}