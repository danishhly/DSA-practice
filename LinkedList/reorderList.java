package LinkedList;

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class reorderList {

    // Reorders the list in-place to: L0 → Ln → L1 → Ln-1 → ...
    public void reorderList1(ListNode head) {
        if (head == null || head.next == null) return;

        // ---------- STEP 1: find middle ----------
        ListNode slow = head;
        ListNode fast = head;
        // For even length, slow will stop at the node just before the second half
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split into two lists
        ListNode second = slow.next;
        slow.next = null; // terminate first half

        // ---------- STEP 2: reverse second half ----------
        ListNode prev = null;
        ListNode curr = second;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        // prev is now head of reversed second half
        second = prev;

        // ---------- STEP 3: merge alternately ----------
        ListNode first = head;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            // move pointers forward
            first = tmp1;
            second = tmp2;
        }
    }

    // Utility: print list (for testing)
    public static void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Example main to test
    public static void main(String[] args) {
        // build list 1->2->3->4->5->6
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int i = 2; i <= 6; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }

        System.out.print("Before: ");
        printList(head);

        new reorderList().reorderList1(head);

        System.out.print("After:  ");
        printList(head); // expected: 1 -> 6 -> 2 -> 5 -> 3 -> 4
    }
}
