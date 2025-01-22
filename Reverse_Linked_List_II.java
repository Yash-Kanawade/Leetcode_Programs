public class Reverse_Linked_List_II {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (head == null || head.next == null)
            return head;
        ListNode prevnode = dummy;
        for (int i = 0; i < left - 1; i++) {
            prevnode = prevnode.next;
        }
        ListNode curr = prevnode.next;
        ListNode nextnode = curr.next;
        for (int i = 0; i < (right - left); i++) {
            curr.next = nextnode.next;
            nextnode.next = prevnode.next;
            prevnode.next = nextnode;
            nextnode = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int left = 2;
        int right = 4;
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("");

        // Call the reverseBetween function
        Reverse_Linked_List_II obj = new Reverse_Linked_List_II();
        ListNode newHead = obj.reverseBetween(head, left, right);

        // Print the reversed linked list
        while (newHead != null) {
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println("null");
    }

}
