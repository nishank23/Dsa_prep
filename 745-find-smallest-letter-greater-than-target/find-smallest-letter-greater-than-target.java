class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char cletter:letters){
            if(target<cletter){
                return cletter;
            }
        }

        return letters[0];
    }
}