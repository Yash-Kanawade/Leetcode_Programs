import java.util.Stack;

class Decode_String {
    Stack<Integer> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();

    public String decodeString(String s) {
        int k = 0;
        String curstr = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = (c - '0');
            } else if (c == '[') {
                stack1.push(k);
                stack2.push(curstr);
                curstr = "";
                k = 0;
            } else if (c == ']') {
                int repeattimes = stack1.pop();
                StringBuilder temp = new StringBuilder(stack2.pop());
                for (int i = 0; i < repeattimes; i++) {
                    temp.append(curstr);
                }
                curstr = temp.toString();
            } else {
                curstr += c;
            }
        }
        return curstr;
    }

    public static void main(String[] args) {
        String s = "100[leetcode";
        Decode_String obj = new Decode_String();
        System.out.println(obj.decodeString(s));
    }
}