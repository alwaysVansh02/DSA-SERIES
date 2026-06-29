//You are given the head of a singly linked list. If a loop is present in the linked list then return the first node of the loop else return -1.
// Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. 
  // If pos = 0, it means the last node points to null, indicating there is no loop. Note that pos is not passed as a parameter.

package Linked_List;

class Nodelist{
    int data;
    Node next;
    Nodelist(int new_data){
        data = new_data;
        next = null;
    }
}
public class First_Node_In_LL {
   static int startOfCycle(Node head){
        Node slow= head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                slow = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
        return -1;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head.next.next.next.next.next = head.next.next;
        int loopNode = startOfCycle(head);
        if (loopNode != -1)
            System.out.println(loopNode);
        else
            System.out.println(-1);
    }
}
