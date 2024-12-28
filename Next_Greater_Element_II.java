import java.util.Stack;

public class Next_Greater_Element_II {
    Stack<Integer> stack = new Stack<>();

    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int[] taken = new int[nums.length];
        stack.push(0);
        int i = 0;
        while (!stack.isEmpty()) {
            i = (i + 1) % nums.length;
            if (nums[i] > nums[stack.peek()]) {
                while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                    taken[stack.peek()] = 1;
                    result[stack.pop()] = nums[i];
                }
            } else if (stack.peek() == i) {
                taken[stack.peek()] = 1;
                result[stack.pop()] = -1;
            }
            if (taken[i] != 1 && !stack.contains(i)) {
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 1, 1 };
        Next_Greater_Element_II obj = new Next_Greater_Element_II();
        int[] r = obj.nextGreaterElements(nums);
        for (int k : r) {
            System.out.print(k);
        }
    }
}
