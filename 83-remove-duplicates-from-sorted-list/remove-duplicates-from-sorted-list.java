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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode move=dummy.next;
        ListNode temp=head;
        while(temp!=null){
            if(move.val!=temp.val){
                move.next=temp;
                move=move.next;
            }
            temp=temp.next;
        }
        move.next=null;
        return dummy.next;
    }
}