class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total_app = 0;
        for(int app : apple){
            total_app += app;
        }
        int noOfBoxes = 0;
        for(int i = capacity.length-1;i>=0;i--){
            if(total_app<=0){
                break;
            }
            total_app -=capacity[i]; 
            noOfBoxes++;
        }
        return noOfBoxes;

    }
}