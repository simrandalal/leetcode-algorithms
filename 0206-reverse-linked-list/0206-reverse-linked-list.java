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
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next == null){
            return head;
        }
        
        ListNode temp = head.next;
        
        ListNode newHead = reverseList(head.next);
        head.next=null;
        temp.next=head;

        return newHead;
        
    }
}