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
        if(head==null ||head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode dummy=new ListNode(-1);
        ListNode result=dummy;
        while(temp!=null){
            ListNode current=temp;
            while(temp.next!=null && temp.val==temp.next.val){
                    temp=temp.next;
            }
            if(current==temp){
                result.next=current;
                result=result.next;
            }
            if(temp!=null){
                temp=temp.next;
            }
            result.next=null;
        }
        return dummy.next;
    }
}