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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp==null) return head;
            temp=temp.next;
        }
        ListNode pre=null,curr=head,next=null;
        int cnt=0;
        while(curr!=null&&cnt<k){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
            cnt++;
        }
        head.next=reverseKGroup(curr,k);
        return pre;
    }
}