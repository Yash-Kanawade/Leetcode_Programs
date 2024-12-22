import java.util.Stack;

class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
        Daily_Temperatures obj = new Daily_Temperatures();
        int[] result = obj.dailyTemperatures(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }
}