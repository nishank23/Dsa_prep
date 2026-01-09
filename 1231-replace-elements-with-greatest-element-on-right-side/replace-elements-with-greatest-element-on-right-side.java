class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            int[] sub = Arrays.copyOfRange(arr, i+1, n+1); 
            int max = sub[0];
            for(int j =1;j<sub.length;j++){
                if(max<sub[j]){
                    max=sub[j];
                }
            }
            arr[i] = max;
        }
        arr[n-1] = -1;

       return arr;
    }
}