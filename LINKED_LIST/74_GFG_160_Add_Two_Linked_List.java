// You are given the head of two singly linked lists head1 and head2 representing two non-negative integers. You need to return the head of the linked list representing the sum of these two numbers.
// Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.class Node {
    constructor(val) {
        this.data = val;
        this.next = null;
    }
}

// function to reverse a linked list
function reverse(head) {
    let prev = null;
    let current = head;
    let next;

    while (current !== null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    return prev;
}

function addTwoLists(head1, head2) {
    
    // reverse both lists to start 
    // from least significant digit
    head1 = reverse(head1);
    head2 = reverse(head2);

    Node  sum = null;
    int  carry = 0;

    // loop until both lists and 
    // carry are exhausted
    while (head1 !== null || head2 !== null || carry !== 0) {
        int  newVal = carry;

        if (head1) {
            newVal += head1.data;
            head1 = head1.next;
        }
        if (head2) {
            newVal += head2.data;
            head2 = head2.next;
        }

        carry = Math.floor(newVal / 10);
        newVal = newVal % 10;

        Node newNode = new Node(newVal);
        newNode.next = sum;
        sum = newNode;
    }

    // remove leading zeros
    while (sum !== null && sum.data === 0) {
        sum = sum.next;
    }

    return sum === null ? new Node(0) : sum;
}

static void printList(head) {
    Node curr = head;
    while (curr !== null) {
        result += curr.data;
        if(curr.next !== null){
            result += " -> ";
        }
        curr = curr.next;
    }
    console.log(result.trim());
}

// Driver Code
let num1 = new Node(1);
num1.next = new Node(2);
num1.next.next = new Node(3);

let num2 = new Node(9);
num2.next = new Node(9);
num2.next.next = new Node(9);

let sum = addTwoLists(num1, num2);
printList(sum);
