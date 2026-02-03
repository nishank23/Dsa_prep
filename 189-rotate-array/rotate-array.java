class Solution {
    public void rotate(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int num:nums){
            deque.offer(num);
        }
        while(k>0){
            deque.offerFirst(deque.pollLast());
            k--;
        }
        int n =0;
        for(int num:deque){
            nums[n] = num;
            n++;
        }

    }
}