public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode trav = head;

        int nodes = 0;

        while (trav != null) {
            nodes++;
            trav = trav.next;
        }

        System.out.println(nodes);
        nodes = nodes - n;

        if (nodes == 0) {
            dummy.next = dummy.next.next;
        }

        while (head != null) {
            nodes--;
            if (nodes == 0) {
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        // head.next = new ListNode(2);
        // head.next.next = new ListNode(2);
        // head.next.next.next = new ListNode(2);
        // head.next.next.next.next = new ListNode(4);
        // head.next.next.next.next.next = new ListNode(4);
        // head.next.next.next.next.next.next = new ListNode(5);

        Remove_Nth_Node_From_End_of_List obj = new Remove_Nth_Node_From_End_of_List();

        head = obj.removeNthFromEnd(head, 1);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}
