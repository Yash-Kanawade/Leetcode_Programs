import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Implement_Stack_using_Queues {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public Implement_Stack_using_Queues() {
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        while (queue1.size() != 1) {
            queue2.add(queue1.poll());
        }
        int temp = queue1.poll();
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        return temp;
    }

    public int top() {
        while (queue1.size() != 1) {
            queue2.add(queue1.poll());
        }
        int temp = queue1.peek();
        queue2.add(queue1.poll());
        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }
        return temp;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
