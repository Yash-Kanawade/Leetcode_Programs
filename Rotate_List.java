public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = head;
        ListNode prev = null;
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        count = count - (k % count);

        for (int i = 0; i < count; i++) {
            prev = head;
            if (head.next == null)
                break;
            head = head.next;
        }

        while (head.next != null) {
            head = head.next;
        }

        head.next = dummy;
        dummy = prev.next;
        prev.next = null;
        return dummy;
    }
}
