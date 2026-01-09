import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class insertionatend {

    // Function to insert at end
    public static Node insertionAtEnd(Node head, int x) {
        Node newNode = new Node(x);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Function to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;

        // Number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // Taking node values
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insertionAtEnd(head, val);
        }

        System.out.print("Linked List: ");
        printList(head);

        // Insert new value at end
        System.out.print("Enter value to insert at end: ");
        int x = sc.nextInt();
        head = insertionAtEnd(head, x);

        System.out.print("After insertion: ");
        printList(head);

        sc.close();
    }
}
