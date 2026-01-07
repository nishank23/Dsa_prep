class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i =0;
        int j =0;
        HashSet<Integer> myHashset = new HashSet<>();

        while(i<num1.length && j<num2.length){
            if(num1[i]==num2[j]){
                myHashset.add(num1[i]);
                i++;
                j++;
            }
            else if(num1[i]<num2[j]){
                i++;
            }
            else{
                j++;
            }

        }

        int[] arr = new int[myHashset.size()];
        int k = 0;
        for(int val : myHashset){
            arr[k] = val;
            k++;
        }
        return arr;
    }
}