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
    static ListNode reverse(ListNode start){
        ListNode prev=null;
        ListNode curr=start;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    static ListNode findN(ListNode st,int k){
        int cnt=1;
        ListNode tem=st;
        while(tem!=null){
            if(cnt==k)return tem;
            cnt++;
            tem=tem.next;
        }
        return null;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode previous=head;
        ListNode temp=head;
        while(temp!=null){
            ListNode kthnode=findN(temp,k);
            if(kthnode==null){
                if(previous!=null)previous.next=temp;
                break;
            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }
            else{
                previous.next=kthnode;
            }
            previous=temp;
            temp=nextnode;
        }
        return head;
    }
}




















