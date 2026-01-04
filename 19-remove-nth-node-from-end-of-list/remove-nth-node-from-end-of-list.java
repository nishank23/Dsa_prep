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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        int index = size - n ;
        if(size==n){
            return head.next;
        }
        index--;
        ListNode deleteNode = head;
        while(index>0){
            deleteNode = deleteNode.next;
            index--;
        }
        System.out.println("The index i need to remove "+index);
        deleteNode.next = deleteNode.next.next;


        return head;

    }
}