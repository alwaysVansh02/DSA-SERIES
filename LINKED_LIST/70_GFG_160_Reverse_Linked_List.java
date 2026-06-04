// You are given the head of a singly linked list. You need to reverse the linked list and return the head of the reversed list.
// Examples:
// Input:1-> 2-> 3-> 4
// Output: 4 -> 3 -> 2 -> 1
// time Complexity --> O(n), space--> O(1)
package Linked_List;
import java.util.Stack;
  class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }
public class Print_Reverse_LinkedList {
    static Node reverselist(Node head){
    Stack<Node> stack = new Stack<>();
        Node temp = head;
            while(temp !=null)

        {
            stack.push(temp);
            temp = temp.next;
        }
            if(!stack.isEmpty())

        {
            head = stack.pop();
            temp = head;
            while (!stack.isEmpty()) {
                temp.next = stack.pop();
                temp = temp.next;
            }
            temp.next = null;
        }
            return head;
    }
    static void printlist(Node node){
        while (node != null){
            System.out.print(node.data);
            if (node.next != null)
                System.out.print(" --> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next = new Node(5);
        head = reverselist(head);
        printlist(head);
    }
}
  
