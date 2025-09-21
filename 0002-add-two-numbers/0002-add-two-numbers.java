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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(t1!=null || t2!=null){
            int sum=carry;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            ListNode nn=new ListNode(sum%10);
            carry=sum/10;
            curr.next=nn;
            curr=curr.next;
        }
        if(carry>0){
            ListNode newnode=new ListNode(carry);
            curr.next=newnode;
            return dummy.next;
        }
        return dummy.next;
    }
}