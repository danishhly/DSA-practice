package LinkedList;

class EmptyListCheck {
    public static void main(String[] args) {
        Node head = new Node(12);

        if (head == null)
           System.out.println("Linked list is empty");
        else
            System.out.println("Linked List is not empty");
    }
}