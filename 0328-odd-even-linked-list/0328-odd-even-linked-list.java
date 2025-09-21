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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=head;
        if(head==null){
            return null;
        }
        ListNode even=head.next;
        ListNode join=even;
        if(head.next==null || head.next.next==null){
            return head;
        }
        while(odd!=null && odd.next!=null && even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        if(odd!=null && odd.next!=null && odd.next.next!=null){
            odd.next=odd.next.next;
            odd.next=null;
        }
        if(even!=null && even.next!=null && even.next.next!=null){
            even.next=even.next.next;
            even.next=null;
        }
        
        odd.next=join;
        return head;
    }
}