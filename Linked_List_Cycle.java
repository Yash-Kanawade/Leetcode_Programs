import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> table = new HashMap<>();
        if (head == null)
            return false;
        while (head != null) {
            if (!table.isEmpty() && table.containsKey(head))
                return true;
            else {
                table.put(head, head.val);
                head = head.next;
            }
        }

        return false;

    }

    // if (arr.contains(head.next))
    // return true;
    // else
    // arr.add(head.next);

    // head = head.next;

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        Linked_List_Cycle obj = new Linked_List_Cycle();

        System.out.println(obj.hasCycle(list1));

    }
}
