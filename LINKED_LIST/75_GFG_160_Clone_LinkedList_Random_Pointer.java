package Linked_List;

import java.util.HashMap;
import java.util.Map;

class Node{
    int data;
    Node next;
    Node random;
    Node(int x){
        data = x;
        next = null;
        random = null;
    }
}
public class clonelll {
static Node cloneLinkedList(Node head){
    Map<Node, Node> mp = new HashMap<>();
    Node curr = head;
    while (curr != null) {
        mp.put(curr, new Node(curr.data));
        curr = curr.next;
    }
    curr = head;
        while (curr != null){
            Node newNode = mp.get(curr);
            newNode.next = mp.get(curr.next);
            newNode.random = mp.get(curr.random);
            curr = curr.next;
        }
        return mp.get(head);
}
static void printList(Node head){
    while (head != null){
        System.out.print(head.data + "(");
        if (head.random != null)
            System.out.print(head.random.data + ")");
        else System.out.print("null"  + ")");
        if (head.next != null)
            System.out.print("->");
        head = head.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head.next;
        System.out.println("Original linked list:");
        printList(head);

        Node clonedList = cloneLinkedList(head);

        System.out.println("Cloned linked list:");
        printList(clonedList);
    }

}
