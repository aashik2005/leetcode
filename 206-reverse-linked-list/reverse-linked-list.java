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
        ListNode prev=null;
        ListNode move=head;
        if(head==null){
            return head;
        }
        while(move!=null){
            ListNode temp=move;
            move=temp.next;
            temp.next=prev;
            prev=temp;
        }
        return prev;
    }
}