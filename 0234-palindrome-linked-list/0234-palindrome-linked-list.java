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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp=slow;
        ListNode prev=null;
        while(temp!=null){
            ListNode keep=temp;
            temp=temp.next;
            keep.next=prev;
            prev=keep;
        }
        
        while(prev!=null){
            if(head.val!=prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}