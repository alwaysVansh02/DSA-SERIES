//You are given the head of a singly linked list, you have to left rotate the linked list k times. Return the head of the modified linked list.

package Linked_List;
class listNode{
    int data;
    Node next;
    listNode(int new_data){
        data = new_data;
        next = null;
    }
}
public class Rotate_Linked_Lisst {
  // Aproach Using By changing pointer of kth node - O(n) Time and O(1) Space
 static Node rotate(Node head, int k) {
        if (k == 0 || head == null)
            return head;
        Node curr = head;
        int len = 1;
        while (curr.next != null) {
            curr = curr.next;
            len += 1;
        }
        k %= len;
        if (k == 0)
            return head;
        curr.next = head;
        curr = head;
        for (int i = 1; i < k; i++)
            curr = curr.next;
            head = curr.next;
            curr.next = null;
            return head;

    }


    static void printlist(Node node) {
        while (node != null) {
            System.out.print(node.data);
            if (node.next != null) {
                System.out.print(" --> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head = rotate(head,6);
        printlist(head);
    }
}
