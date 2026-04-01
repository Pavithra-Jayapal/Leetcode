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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int val1=l.get(k-1);
        int val2=l.get(l.size()-k);
        l.set(k-1,val2);
        l.set(l.size()-k,val1);

        ListNode ll=new ListNode(l.get(0));
        ListNode curr=ll;
        for(int i=1;i<l.size();i++){
            curr.next=new ListNode(l.get(i));
            curr=curr.next;
        }
        return ll;
    }
}