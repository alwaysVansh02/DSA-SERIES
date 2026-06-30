// Given the head of a singly linked list, the task is to remove a cycle if present. A cycle exists when a node's next pointer points back to a previous node, forming a loop.

// Internally, a variable pos is used to denotes the position of the node where the cycle starts, but it is not passed as a parameter.
// The linked list remains as it is if there is cycle in the list.
// The output will be "true" if your code works according to expectations, otherwise "false". 

package Linked_List;

import java.util.HashSet;

class NodeL{
    int data ;
    NodeL next;
    NodeL(int x){
        data = x;
        next = null;
    }
}
public class Detect_andRemove_Loop_LL {
   static void  removeloop(NodeL head){
        if (head == null || head.next == null)
            return;
        NodeL slow = head,fast = head;
        slow = slow.next;
        fast = fast.next.next;
        while (fast!= null && fast.next != null){
            if (slow == fast)
                break;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow ==  fast){
            slow = head;
            if (slow != fast){
                while (slow.next != fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next= null;
            }else {
                while (fast.next != slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
    static void printList(NodeL curr){
        while (curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NodeL head = new NodeL(1);
        head.next = new NodeL(3);
        head.next.next = new NodeL(4);

        head.next.next.next = head.next;
        removeloop(head);
        printList(head);
    }
}
