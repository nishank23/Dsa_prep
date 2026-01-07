class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i =0;
        int j =0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> hashSet = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                hashSet.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr = new int[hashSet.size()];
        int k =0;
        for(int val : hashSet){
            arr[k] = val;
            k++;
        }
        return arr;
    }
}