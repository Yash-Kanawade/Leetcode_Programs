import java.util.List;

class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        return mergedListsHelper(lists, 0, lists.length - 1);
    }

    private ListNode mergedListsHelper(ListNode[] lists, int start, int end) {

        if (start == end)
            return lists[start];
        if (start + 1 == end)
            return merge(lists[start], lists[end]);

        int mid = start + (end - start) / 2;
        ListNode left = mergedListsHelper(lists, start, mid);
        ListNode right = mergedListsHelper(lists, mid + 1, end);

        return merge(left, right);

    }

    private ListNode merge(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null)
            curr.next = l1;
        else
            curr.next = l2;

        return dummy.next;

    }

    public static void main(String[] args) {

        ListNode[] lists = new ListNode[3];

        // Create sample linked lists
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));

        // Print the input linked lists
        System.out.println("Input Linked Lists:");
        for (int i = 0; i < lists.length; i++) {
            ListNode current = lists[i];
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Call the mergeKLists function and print the merged result
        Merge_k_Sorted_Lists solution = new Merge_k_Sorted_Lists();
        ListNode result = solution.mergeKLists(lists);

        // Print the merged linked list
        System.out.println("\nMerged Linked List:");
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}