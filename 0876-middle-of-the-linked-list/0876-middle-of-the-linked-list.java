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
        int length = 0;
        ListNode current = head;
        ListNode temp = head;

        while(current != null){
            length++;
            current = current.next;
        }
        int middle = length/2;

        int i = 0;
        
        while(i<middle){
            temp = temp.next;
            i++;
        }

        return temp;
    }
}