class Solution {
    public boolean canConstruct(String ransomNote, String mag) {
         HashMap<Character,Integer> characterIntegerHashMap = new HashMap<>();

        for(char c : mag.toCharArray()){
            characterIntegerHashMap.put(c,(characterIntegerHashMap.getOrDefault(c,0))+1);
        }

        for(char c : ransomNote.toCharArray()){
            characterIntegerHashMap.put(c,(characterIntegerHashMap.getOrDefault(c,0))-1);
        }

        for(Integer values:characterIntegerHashMap.values()){
            if(values<0){
                return false;
            }
        }

        return true;
    }
}