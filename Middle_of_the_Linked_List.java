public class Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count / 2;
        while (count != 0) {
            head = head.next;
            count--;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list2 = new ListNode(1,
                new ListNode(3, new ListNode(4, new ListNode(1, new ListNode(2, new ListNode(4))))));
        Middle_of_the_Linked_List obj = new Middle_of_the_Linked_List();
        ListNode node = obj.middleNode(list2);
        while (list2 != null) {
            System.out.println(list2.val);
            list2 = list2.next;
        }
        System.out.println("new");
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}