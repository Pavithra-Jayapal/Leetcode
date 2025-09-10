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
        if(head==null&&head.next==null) return true;
        ListNode slow=head,fast=head;
        ListNode pre=null,curr=head,safe=null;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            safe=curr.next;
            curr.next=pre;
            pre=curr;
            curr=safe;
        }
        ListNode t1=slow,t2=pre;
        if(fast!=null){
            t1=slow.next;
        }
        while(t1!=null&&t2!=null){
            if(t1.val==t2.val){
                t1=t1.next;
                t2=t2.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}