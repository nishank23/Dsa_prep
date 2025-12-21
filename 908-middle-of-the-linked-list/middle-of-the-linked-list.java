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
    public ListNode middleNode(ListNode head) {
       int size  = 0;
        ListNode curr = head;
        while(curr!=null){
         curr =curr.next;
         size++;
        }
        size = (size/2);
        System.out.println("Size of the current list "+size);
        while(size!=0) {
            head = head.next;
            size--;
        }

        return head; 
    }
}