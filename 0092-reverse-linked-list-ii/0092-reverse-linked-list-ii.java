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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null) return head;
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode pre=dummy,fwd=null;
       for(int i=1;i<left;i++){
        pre=pre.next;
       }
       ListNode curr=pre.next;
       for(int i=0;i<right-left;i++){
        fwd=curr.next;
        curr.next=fwd.next;
        fwd.next=pre.next;
        pre.next = fwd;
       }
        return dummy.next;
    }
}