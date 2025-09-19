class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i =0;i<matrix.length;i++){
            if(binarySearch(matrix[i],0,matrix[i].length-1,target)){
                return true;
            }
            
        }
        return false;
    }
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