/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*Time complexity: O(n)
            - No cycle = Goes to list length (n)
            - Has cycle = O(n+K)
          Space complexity: O(1)
        */

        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;


//         HashSet<ListNode> set = new HashSet<ListNode>();

//         while(head != null){
//             if(set.contains(head)){
//                 return true;
//             } else {
//                 set.add(head);
//             }
//             head = head.next;
//         }

//         return false;



    }
}
