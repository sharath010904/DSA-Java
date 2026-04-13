class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListReverse {
    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Reverse the list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // store next
            current.next = prev;  // reverse link
            prev = current;       // move prev
            current = next;       // move current
        }
        head = prev;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original List:");
        list.display();

        list.reverse();

        System.out.println("Reversed List:");
        list.display();
    }
}
