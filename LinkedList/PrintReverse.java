package LinkedList;

class PrintReverse {
    static void ReversePrint(Node head) {
    if(head == null) return;
    ReversePrint(head.next);  // Go till the end
    System.out.println(head.data + " "); // Print while returning
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        ReversePrint(head);
    }
}
