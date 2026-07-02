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
    int max=0;
    public int pairSum(ListNode head) {
        ans(head,head);
        return max;
    }
    public ListNode ans(ListNode h,ListNode cur){
        ListNode x;
        if(cur!=null)
            x = ans(h,cur.next);
        else return h;
        if(max<cur.val+x.val) max = cur.val+x.val;
        return x.next;
    }
}