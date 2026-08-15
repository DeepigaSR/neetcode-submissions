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
    public ListNode removeNthFromEnd(ListNode head, int n) {

// Advances first pointer so that the gap between first and second is n nodes apart
// Create two pointers, fastp and slowp
// Move the fastp pointer N nodes ahead
// Move both pointers until fastp reaches the end
// Delete the Nth node from the end

// TC: O(n), SC: O(1)

    ListNode slow=head, fast=head;
    for(int i=0;i<n;i++){
        fast = fast.next;
    }
// case where n is the length of the list, remove head
    if(fast==null){
        head= head.next;
        return head;
    }

    while(fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    slow.next= slow.next.next;
    return head;

    }
}
