class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode curr = head;

        while (curr.next != null) {

            int a = curr.val;
            int b = curr.next.val;

            int gd = gcd(a, b);

            ListNode newNode = new ListNode(gd);

            // Insert newNode between curr and curr.next
            newNode.next = curr.next;
            curr.next = newNode;

            // Move to the original next node
            curr = newNode.next;
        }

        return head;
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}