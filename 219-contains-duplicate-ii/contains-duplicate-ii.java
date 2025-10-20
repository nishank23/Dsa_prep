class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]) && (i - hashMap.get(arr[i])) <=k) {
                return true;
            }
            hashMap.put(arr[i], i);

        }
        return false;
    }
}