class Solution {
    public boolean isIsomorphic(String s, String t) {
              HashMap<Character,Character> sHash = new HashMap<>();
              HashMap<Character,Character> tHash = new HashMap<>();

        for(int i =0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(sHash.containsKey(a) &&sHash.get(a)!=b){
                return false;
            }
            if(tHash.containsKey(b) && tHash.get(b)!=a){
                return false;
            }
            sHash.put(a,b);
            tHash.put(b,a);
        }
        return true;
    }
}