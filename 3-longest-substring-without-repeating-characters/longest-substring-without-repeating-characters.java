class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashSet<Character> mySet = new HashSet<>();
        int l = 0;
        for(int r =0;r<s.length();r++){
           while(mySet.contains(s.charAt(r))){
                mySet.remove(s.charAt(l));
                l++;
           }
           mySet.add(s.charAt(r));
            res = Math.max(res,mySet.size());
        }
        return res;
    }
}