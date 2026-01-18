// class Solution {
//     public int longestConsecutive(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for (int num : nums) set.add(num);

//         int longest = 0;

//         for (int num : set) {
//             if (!set.contains(num - 1)) {
//                 int current = num;
//                 int count = 1;

//                 while (set.contains(current + 1)) {
//                     current++;
//                     count++;
//                 }

//                 longest = Math.max(longest, count);
//             }
//         }

//         return longest;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int n = nums.length;
        int maxCount =0;
        int count =0;
        Arrays.sort(nums);
        for(int i =1;i<n;i++){
            int sub = nums[i] - nums[i-1];
            if(sub==1){
                count++;
            }
            if(maxCount<count){
                maxCount = count;
            }

            if(sub>1){
                count=0;
            }

        }
        return ++maxCount;

    }
}