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
         if(head==null || head.next ==null){
            return true;
        }
        ListNode dummy = head;
        ListNode fast = head;
        ListNode slow = head;

        int size=0;
        while(dummy!=null){
            dummy = dummy.next;
            size++;
        }
        size = size/2;
        ListNode prev = null;
        while(size!=0){
            fast = fast.next;
            size--;
        }
        prev = fast;

        // 1 -> 2 -> 3 -> null

        // null -> 3 -> 2 -> 1
        ListNode prev2= null;
        while(prev!=null){
            ListNode temp = prev.next;
            prev.next = prev2;
            prev2 = prev;
            prev = temp;
        }





        System.out.println("VALUE OF SLOW POINTER "+slow.val);

        System.out.println("VALUE OF FAST POINTER "+prev2.val);

        while(prev2!=null){
            if(prev2.val!=slow.val){
                return false;
            }
            slow = slow.next;
            prev2 = prev2.next;
        }

        return true;

    }
}