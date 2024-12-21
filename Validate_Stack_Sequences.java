import java.util.Stack;

public class Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0, i = 0;
        while (i != pushed.length + 1) {
            if (stack.isEmpty()) {
                stack.push(pushed[i]);
                i++;
            } else if (stack.peek() == popped[j]) {
                j++;
                stack.pop();
                if (stack.isEmpty() && j == popped.length)
                    break;
            } else {
                if (i == pushed.length)
                    break;
                stack.push(pushed[i]);
                i++;
            }
            System.out.println(stack);
        }
        if (j == popped.length && stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] pushed = { 1, 0 };
        int[] poped = { 1, 0 };
        Validate_Stack_Sequences obj = new Validate_Stack_Sequences();
        System.out.println(obj.validateStackSequences(pushed, poped));
    }
}
