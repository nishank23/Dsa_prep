class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxVal = 0;
        for(int i =0;i<accounts.length;i++){
            int currBal =0;
            for(int j = 0;j<accounts[i].length;j++){
                currBal += accounts[i][j];
            }
            if(maxVal<currBal){
                maxVal = currBal;
            }
        }
        return maxVal;
    }
}