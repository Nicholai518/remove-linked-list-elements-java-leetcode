public class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // the head node has the val
        // we must update the head node
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode currentNode = head;

        // check for null at current node and next node
        // we want to make sure next node is not null before
        // we check for the val
        while (currentNode != null && currentNode.next != null) {

            if (currentNode.next.val == val) {

                // skip over node with val
                currentNode.next = currentNode.next.next;
            }
            // if the next node.val is NOT equal to val
            // keep traversing normally
            else {
                currentNode = currentNode.next;
            }
        }

        // return head of new list
        return head;
    }
}

