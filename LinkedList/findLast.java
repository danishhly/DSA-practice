package LinkedList;

class findLast {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next = new Node(25);

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
        System.out.println("last node: " + temp.data);
    }
}
