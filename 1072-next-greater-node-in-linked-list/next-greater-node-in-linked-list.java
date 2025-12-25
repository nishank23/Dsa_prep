/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        while(head!=null){
            if(head.next!=null){
                ListNode greater = head.next;
                while(greater!=null && greater.val<=head.val){
                    greater = greater.next;
                }
                if(greater!=null){
                    myArrayList.add(greater.val);
                }else{
                    myArrayList.add(0);
                }
            }else{
                myArrayList.add(0);
            }
            head=head.next;
        } 
        int[] ans = new int[myArrayList.size()];
        for(int i =0;i<myArrayList.size();i++){
            ans[i] = myArrayList.get(i);
        }
        return ans;
    }
}