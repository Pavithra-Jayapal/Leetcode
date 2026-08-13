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
        int sum=0;
        int carry=0;
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy; 
        while(t1!=null || t2!=null){
            int val_1=(t1!=null)?t1.val:0;
            int val_2=(t2!=null)?t2.val:0;
            sum=val_1+val_2+carry;
            carry=sum/10;
            ListNode node=new ListNode(sum%10);
            dummy.next=node;
            dummy=dummy.next;
            t1=(t1!=null)?t1.next:null;
            t2=(t2!=null)?t2.next:null;
        }
        if(carry>0){
            ListNode n=new ListNode(carry);
            dummy.next=n;
        }
        return ans.next;
    }
}