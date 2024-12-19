import java.util.Stack;

public class Minstack {
    private Stack<Integer> s;
    private Stack<Integer> mins;

    public Minstack() {
        s = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int val) {
        if (mins.isEmpty() || mins.peek() >= val) {
            mins.push(val);
        }
        s.push(val);
    }

    public void pop() {
        if (s.peek().equals(mins.peek()))
            mins.pop();
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return mins.peek();
    }

    public static void main(String[] args) {
        Minstack obj = new Minstack();
        obj.push(-2);
        obj.push(0);
        obj.push(-1);
        System.out.println(obj.s);
        System.out.println(obj.mins);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}
