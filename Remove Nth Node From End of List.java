/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Time complexity: O(L) since it makes 1 traversal of a list of L nodes
        //Space complexity: O(1) since we only used constant extra space making a few nodes
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode first = temp;
        ListNode second = temp;

        for(int i = 1; i<=n; i++){
            first = first.next;
        }

        while(first.next != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return temp.next;
    }
}
