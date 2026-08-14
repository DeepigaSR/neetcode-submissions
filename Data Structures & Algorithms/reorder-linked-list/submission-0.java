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
    public void reorderList(ListNode head) {

        // TC: O(n), SC: O(1)
        // Find the mid of linkedlist and split it into two
        ListNode fast= head, slow=head;
        while(fast.next !=null && fast.next.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next = null;

        //reverse the second linkedlist from mid
        ListNode prev=null,nextNode=null,curr=mid;
        while(curr!=null){
            nextNode = curr.next;
            curr.next = prev;
            prev=curr;
            curr = nextNode;
        }

        // reorder the list
        ListNode first=head,second=prev;
        while(second!=null){
            nextNode = first.next;
            first.next=second;
            first=nextNode;

            nextNode=second.next;
            second.next=first;
            second=nextNode;
        }

    }
}
