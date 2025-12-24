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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null){
            return null;
        }
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        size = size/2;
        ListNode del = head;
        size--;
        while(size!=0){
            del = del.next;
            size--;
        }
        if(del.next!=null)
        del.next = del.next.next;








        return head;
    }
}