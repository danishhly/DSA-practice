package LinkedList;

import java.util.Scanner;

// Node class (represents a single linked list node)
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with LSearch method (Move-to-Front)
class LinkedList {
    Node first;

    // Insert new node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // Display linked list
    public void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // LSearch: Move-to-Front Search
    public Node LSearch(int key) {
        Node p = first;
        Node q = null;

        while (p != null) {
            if (p.data == key) {
                if (q != null) {
                    q.next = p.next;
                    p.next = first;
                    first = p;
                }
                return p;
            }
            q = p;
            p = p.next;
        }
        return null;
    }
}

// Main class for input/output
public class Movingtofront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insert(val);
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        Node result = list.LSearch(key);
        if (result != null) {
            System.out.println("Element found: " + result.data);
            System.out.print("List after move-to-front: ");
            list.display();
        } else {
            System.out.println("Element not found!");
        }

        sc.close();
    }
}
