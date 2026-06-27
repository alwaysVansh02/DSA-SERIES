// You are given the head of a singly linked list. You have to determine whether the given linked list contains a loop or not.
// A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.
// Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. 
// If pos = 0, it means the last node points to null. Note that pos is not passed as a parameter.
package Linked_List;

import java.util.HashSet;

class NodeList{
    int data;
    Node next;
    NodeList(int x){
        this.data = x;
        this.next = null;
    }
}
/// 1. st Aproach Using HashSet in time-O(n and space ->O(n
public class Detect_Cycle_In_LL {
   static boolean detectloop(Node head){
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);

        head.next.next.next = head.next;
        if (detectloop(head))
            System.out.println("True");
        else
            System.out.println("False" );
    }
}
