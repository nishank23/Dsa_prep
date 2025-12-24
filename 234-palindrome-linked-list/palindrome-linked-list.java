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
    public boolean isPalindrome(ListNode head) {
          if(head == null || head.next == null){
            return true;
        }
        
        ListNode lengthNode = head;
        int size = 0;
        while(lengthNode!=null){
            lengthNode=lengthNode.next;
            size++;
        }
        size = size/2;
        ListNode firstHalfPointer = head;
        while(size!=0){
            firstHalfPointer = firstHalfPointer.next;
            size--;
        }
    
        ListNode reverseFirstHalf = null;
        
        
        while(firstHalfPointer!=null){
            ListNode temp = firstHalfPointer.next;
            firstHalfPointer.next = reverseFirstHalf;
            reverseFirstHalf = firstHalfPointer;
            firstHalfPointer = temp;
        }
        
        ListNode checkPointer = head;
        
        
        while(reverseFirstHalf!=null){
            if(reverseFirstHalf.val != checkPointer.val){
                return false;
            }
            checkPointer = checkPointer.next;
            reverseFirstHalf = reverseFirstHalf.next;
        }
        return true;
        
    }
}