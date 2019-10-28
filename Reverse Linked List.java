/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
//         if(head == null){ return null; }

//         ListNode reversedNode = new ListNode(head.val);
//         reversedNode.next = null;
//         head = head.next;

//         ListNode reversedHead = reversedNode;

//         while(head != null){
//             ListNode node = new ListNode(head.val);
//             node.next = reversedHead;
//             reversedHead = node;
//             head = head.next;
//         }

//         return reversedHead;

        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode node = current.next;
            current.next = previous;
            previous = current;
            current = node;
        }

        return previous;
    }
}
