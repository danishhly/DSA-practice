package LinkedList;

class node {
    int data;
    Node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class printElements {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(29);
        head.next.next = new Node(30);
        head.next.next.next = new Node(49);

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
