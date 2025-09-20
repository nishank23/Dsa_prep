class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int topRow = 0;
        int botRow = row - 1;

        while(topRow<=botRow){
            int midrow = (topRow+botRow)/2;
            if(target>matrix[midrow][col-1]){
                topRow = midrow + 1;
            }else if(target<matrix[midrow][0]){
                botRow = midrow - 1;
            }else{
                break;
            }
        }
       
        if(!(topRow<=botRow))
        {
            return false;
        }
        int foundRow = (topRow + botRow)/2;
        int l = 0 , r = col-1;

        while(l<=r){
            int midCol = (l+r)/2;
            if(target>matrix[foundRow][midCol]){
                l = midCol +1;
            }else if(target<matrix[foundRow][midCol]){
                r = midCol -1;
            }else{
                return true;
            }
        }
        return false;

    }






    // public boolean searchMatrix(int[][] matrix, int target) {
    //     for(int i =0;i<matrix.length;i++){
    //         if(binarySearch(matrix[i],0,matrix[i].length-1,target)){
    //             return true;
    //         }
            
    //     }
    //     return false;
    // }
    public boolean binarySearch(int[] arr , int left, int right , int target){
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]<target){
                left = mid+1;
            }else if(arr[mid]>target){
                right = mid -1;
            }else {
                return true;
            }

        }
        return false;

    }
}