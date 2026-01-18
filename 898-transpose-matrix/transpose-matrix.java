class Solution {

    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] trans = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        return trans;
    }
}
