/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        if(head==null){
            return head;
        }
        while(temp!=null){
            Node nn=new Node(temp.val);
            nn.next=temp.next;
            temp.next=nn;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }  
            temp=temp.next.next;
        }
        temp=head;
        Node newhead=head.next;
        Node copy=newhead;
        while(temp!=null){
            temp.next=temp.next.next;
            if(copy.next!=null){
                copy.next=copy.next.next;
            }
            temp=temp.next;
            copy=copy.next;
        }
        return newhead;
    }
}