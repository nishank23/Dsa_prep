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
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null) {
                ListNode greater = curr.next;
                while (greater!=null && curr.val >= greater.val) {
                    greater = greater.next;
                }
                if(greater!=null){
                    arrayList.add(greater.val);
                    }
                else{
                    arrayList.add(0);
                    }
                
            }else{
                arrayList.add(0);
            }



            curr = curr.next;
        }


        int[] ans =new int[arrayList.size()];
        for(int i =0;i<arrayList.size();i++){
            ans[i] = arrayList.get(i);
        }
        return ans;

    }
}
