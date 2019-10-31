/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Time complexity: O(max(m,n)) - m and n being the respective lengths of l1 and l2
        //Space complexity: O(max(m,n)) - the length of the new list will be based off of max(m,n)

        ListNode current = new ListNode(0);
        ListNode head = current;
        ListNode p = l1, q = l2;

        int carry = 0;
        while(p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            if(sum>9){
                sum %= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            head.next = new ListNode(sum);
            head = head.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }

        if(carry == 1){
            head.next = new ListNode(1);
        }

        return current.next;
    }
}
