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
    public int getDecimalValue(ListNode head) 
    {
        ListNode temp = head;
        StringBuilder st = new StringBuilder();
        while(temp!=null)
        {
            st.append(temp.val);
            temp=temp.next;
        }    
        int res = Integer.parseInt(st.toString(),2);
        return res;
    }
}