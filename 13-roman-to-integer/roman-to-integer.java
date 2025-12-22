class Solution {
    public int romanToInt(String s) {
         Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int currNo = 0;

        
        for(int i = 0;i<s.length();i++){
            int check = romanMap.get(s.charAt(i));
            int current = i == s.length()-1 ? 0 : romanMap.get(s.charAt(i+1));
            
            if(check < current)
                currNo-=check;
            else
                currNo+=check;
        }

        return currNo;
    }
}