import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    private Stack<Integer> s = new Stack<>();

    public int evalRPN(String[] tokens) {
        for (String i : tokens) {
            if (i == "+") {
                int a = (s.pop());
                int b = (s.pop());
                s.push((b + a));
            } else if (i == "-") {
                int a = (s.pop());
                int b = (s.pop());
                s.push((b - a));
            } else if (i == "*") {
                int a = (s.pop());
                int b = (s.pop());
                s.push((b * a));
            } else if (i == "/") {
                int a = (s.pop());
                int b = (s.pop());
                s.push((b / a));
            } else {
                s.push(Integer.parseInt(i));
            }
        }
        return (s.pop());
    }

    public static void main(String[] args) {
        Evaluate_Reverse_Polish_Notation obj = new Evaluate_Reverse_Polish_Notation();
        String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(obj.evalRPN(tokens));
    }
}
