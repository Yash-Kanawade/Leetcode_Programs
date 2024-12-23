import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Implement_Stack_using_Queues {
    Deque<Integer> deque = new LinkedList<>();

    public Implement_Stack_using_Queues() {
    }

    public void push(int x) {
        deque.addLast(x);
    }

    public int pop() {
        return deque.removeLast();
    }

    public int top() {
        return deque.peek();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}
