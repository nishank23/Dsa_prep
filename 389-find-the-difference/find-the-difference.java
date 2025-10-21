class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> myHashMap = new HashMap<>();
        for(char schar : s.toCharArray()){
            myHashMap.put(schar,(myHashMap.getOrDefault(schar,0))+1);
        }
        for(char schar : t.toCharArray()){
            myHashMap.put(schar,(myHashMap.getOrDefault(schar,0))-1);
        }

        for(Character ch : myHashMap.keySet()){
            Integer val = myHashMap.get(ch);

            if(val!=0){
                return ch;
            }
        }
        return ' ';
    }
}