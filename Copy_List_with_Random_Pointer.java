import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Copy_List_with_Random_Pointer {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head;

        while (curr != null) {
            Node newnode = new Node(curr.val);
            map.put(curr, newnode);
            curr = curr.next;
        }

        curr = head;

        while (curr != null) {
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);

    }

    public static void main(String[] args) {
        // Create the nodes
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        // Link the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Set random pointers based on the input
        node1.random = null; // [7, null]
        node2.random = node1; // [13, 0]
        node3.random = node5; // [11, 4]
        node4.random = node3; // [10, 2]
        node5.random = node1; // [1, 0]

        Copy_List_with_Random_Pointer obj = new Copy_List_with_Random_Pointer();

        // Copy the list
        Node copiedList = obj.copyRandomList(node1);

        // Print the copied list
        Node temp = copiedList;
        while (temp != null) {
            System.out.println("Node value: " + temp.val + ", Random value: " +
                    (temp.random != null ? temp.random.val : "null"));
            temp = temp.next;
        }
    }

}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
