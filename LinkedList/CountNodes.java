package LinkedList;

public class CountNodes {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(12);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(35);

        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Count = " + count);
    }
}
