 package LinkedList;

import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node3 head;

    public void add(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node3 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    void insertAfterKey(int key, int data) {
        Node3 temp = head;
        // 1. Traverse the list to find the node with the key
        while(temp.next != null && temp.data != key) {
            temp = temp.next;
        }
//        2. If key is not found, print a message and exit
        if(temp == null) {
            System.out.println("key not found");
            return;
        }
//        3. If key is found, create the new node
        Node3 newNode = new Node3(data);
        // 4. Link the new node to the rest of the list
        newNode.next = temp.next;

        temp.next = newNode;
        System.out.println("\nSuccessfully inserted " + data + " after " + key + ".");
    }



    void display() {
        Node3 temp = head;
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class insertAfterKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList2 list = new LinkedList2();

        System.out.println("Enter numbers of elements for initial list: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements ");
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("\n--- Initial List ----");
        list.display();
        System.out.print("\nEnter the key (the number to insert after): ");
        int key = sc.nextInt();

        System.out.print("Enter the value to insert: ");
        int data = sc.nextInt();

        // --- Step 3: Perform the insertion ---
        list.insertAfterKey(key, data);

        // --- Step 4: Display the final list ---
        System.out.println("\n--- Final List ---");
        list.display();

        sc.close();

    }
}


