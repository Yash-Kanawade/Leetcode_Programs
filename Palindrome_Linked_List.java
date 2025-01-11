import java.util.Stack;

public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != temp.val)
                return false;
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_Linked_List obj = new Palindrome_Linked_List();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(1)));
        System.out.println(obj.isPalindrome(list1));
    }
}
