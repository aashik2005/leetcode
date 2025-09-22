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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(0);
        if(head==null){
            return null;
        }
        ListNode move=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
                move.next=temp;
                move=move.next;
            }
            temp=temp.next;
        }
        move.next=null;
        return dummy.next;
    }
}