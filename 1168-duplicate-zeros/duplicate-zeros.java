class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int n = arr.length; 
        for(int num:arr){
            if(num==0){
                arrList.add(0);
                arrList.add(0);
            }else{
                arrList.add(num);
            }
        }
        for(int i =0;i<n;i++){
            arr[i] = arrList.get(i);
        }
    }
}