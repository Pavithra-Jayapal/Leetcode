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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head,next=head.next;
        while(next!=null){
            int sum=0;
            while(next.val!=0){
                sum+=next.val;
                next=next.next;
            }
            curr.val=sum;
            curr.next=next.next;
            curr=curr.next;
            next=curr;
        }
        return head;
    }
}