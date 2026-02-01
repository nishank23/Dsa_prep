class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder sb =new StringBuilder();
        int i = word1.length();
        int j = word2.length();
        int a=0;
        int b =0;



        while(a<i && b<j){
            sb.append(word1.charAt(a));
            sb.append(word2.charAt(b));
            a++;
            b++;
        }
        while(a<i){
            sb.append(word1.charAt(a));
            a++;
        }
        while(b<j){
            sb.append(word2.charAt(b));
            b++;
        }

        return sb.toString();

    }
}