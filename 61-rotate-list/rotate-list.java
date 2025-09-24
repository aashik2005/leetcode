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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail=head;
        if(head==null ||head.next==null || k==0){
            return head;
        }
        int cnt=1;
        while(tail.next!=null){
            tail=tail.next;
            cnt++;
        }
        k=k%cnt;
        if(cnt==0 || k==0){
            return head;
        }
        tail.next=head;
        int diff=cnt-k;
        int ind=0;
        ListNode temp=head;
        while(temp!=null){
            ind++;
            if(ind==diff){
                head=temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}