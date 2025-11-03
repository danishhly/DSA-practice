package LinkedList;

import java.util.Scanner;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

    class LinkedList1 {
        Node2 head;


        void InsertAtEnd(int data) {
            Node2 newNode = new Node2(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node2 temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = newNode;
        }

        void display() {
            Node2 temp = head;
            while(temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public class InsertAtEnd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            LinkedList1 list = new LinkedList1();

            System.out.println("Enter numbers (0 to stop)");
            int val;
            while((val = sc.nextInt()) != 0) {
                list.InsertAtEnd(val);
            }

            System.out.print("Your final list: ");
            list.display();
            sc.close();

        }
    }


