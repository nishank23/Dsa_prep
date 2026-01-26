class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         Arrays.sort(arr);
        int minVal = Integer.MAX_VALUE;

        for(int i =0;i<arr.length-1;i++){
            minVal = Math.min(minVal,arr[i+1] - arr[i]);
        }

        List<List<Integer>> resArrList = new ArrayList<>();
        for(int i = 1 ;i<arr.length;i++){
            int diff = arr[i] - arr[i-1];
            if(minVal==diff){
                resArrList.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
      
        return resArrList;



    }
}