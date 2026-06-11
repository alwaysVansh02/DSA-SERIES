// Given the head of a Singly linked list. Reverse every k node in the linked list and return the head of the modified list.
// Note: If the number of nodes is not a multiple of k then the left-out nodes at the end, should be considered as a group and must be reversed.
class ReverseKGroup {

    public Node reverseKGroup(Node head, int k) {

        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;

        // first k nodes reverse
        while(curr != null && count < k){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            count++;
        }

        // remaining list ke liye recursion
        if(next != null){
            head.next = reverseKGroup(next, k);
        }

        return prev;
    }
}
