// Given the head of two sorted linked lists consisting of nodes respectively. Merge both lists and return the head of the sorted merged list.
// Aproach Using iterative merge in time--> O(n+m) and space-->O(1)
package Linked_List;

import java.util.ArrayList;
import java.util.Collections;

class istNode{
    int data;
    Node next;
    istNode(int x){
        data = x;
        next = null;
    }
}
  static Node sortedmerged(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        while (head1 != null && head2 != null){
            if (head1.data <= head2.data){
                curr.next = head1;
                head1 = head1.next;
            }else {
                curr.next = head2;
                head2 = head2.next;
            }curr = curr.next;
        }if (head1 != null){
            curr.next = head1;
        }else {
            curr.next = head2;
        }return  dummy.next;
    }
    static void printList(Node curr){
        while (curr != null){
            System.out.print(curr.data);
            if (curr.next!= null){
                System.out.print(" -->");
            }
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node hhead1 = new Node(5);
        hhead1.next = new Node(10);
        hhead1.next.next = new Node(15);
        hhead1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedmerged(hhead1,head2);
        printList(res);
    }
}
