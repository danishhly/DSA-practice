package LinkedList;

 class updateNode {
     public static void main(String[] args) {
         Node head = new Node(10);
         head.next = new Node(20);
         head.next.next = new Node(33);

         head.next.data = 99;

         Node temp = head;
         while (temp != null) {
             System.out.println(temp.data + " ");
             temp = temp.next;
         }
     }
}
