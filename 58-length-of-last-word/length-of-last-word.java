class Solution {
    public int lengthOfLastWord(String s) {
        // String[] sArr = s.trim().split(" ");
        // return sArr[sArr.length-1].length();
        int length = 0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}