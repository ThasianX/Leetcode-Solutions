/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode previous = current;

        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                previous.next = l1;
                l1 = l1.next;
            } else {
                previous.next = l2;
                l2 = l2.next;
            }
            previous = previous.next;
        }

        if(l1 == null){
            previous.next = l2;
        }

        if(l2 == null){
            previous.next = l1;
        }

        return current.next;

        // while(current != null){
        //     if(l1 == null && l2 == null){
        //         current = null;
        //     } else if(l1 == null && l2 != null){
        //         ListNode node = new ListNode(l2.val);
        //         current.next = node;
        //         current = node;
        //         l2 = l2.next;
        //     } else if(l1 != null && l2 == null){
        //         ListNode node = new ListNode(l1.val);
        //         current.next = node;
        //         current = node;
        //         l1 = l1.next;
        //     } else {
        //         if(l1.val<l2.val){
        //             ListNode node = new ListNode(l1.val);
        //             current.next = node;
        //             current = node;
        //             l1 = l1.next;
        //         } else {
        //             ListNode node = new ListNode(l2.val);
        //             current.next = node;
        //             current = node;
        //             l2 = l2.next;
        //         }
        //     }
        // }


    }
}
