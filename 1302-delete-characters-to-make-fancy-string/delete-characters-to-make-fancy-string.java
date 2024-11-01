class Solution {
    public String makeFancyString(String news) {
        char[] s = news.toCharArray();
        StringBuilder ans = new StringBuilder();
        ans.append(s[0]);
        int cnt = 1;
        int size = s.length;

        for(int i =1;i<size;i++){
          if(s[i] == ans.charAt(ans.length()-1)){
            cnt++;
            if(cnt<3){
                ans.append(s[i]);
            }
          }else{
                cnt = 1;
                ans.append(s[i]);
          }
        }
        return ans.toString();
    }
}