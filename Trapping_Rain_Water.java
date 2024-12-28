import java.util.Stack;

class Trapping_Rain_Water {
    Stack<Integer> stack_front = new Stack<>();
    Stack<Integer> stack_end = new Stack<>();

    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max_f = 0;
        int max_e = 0;
        int units = 0;
        while (!((i == height.length) || (j < 0))) {
            // if (stack_front.isEmpty())
            // stack_front.push(i);

            // if (stack_end.isEmpty())
            // stack_end.push(j);

            if (stack_front.size() == 1)
                max_f = height[stack_front.peek()];

            if (stack_end.size() == 1)
                max_e = height[stack_end.peek()];

            if (!stack_front.isEmpty() && height[i] > max_f) {

                while (!stack_front.isEmpty())
                    units = units + (max_f - height[stack_front.pop()]);

                stack_front.push(i);
                max_f = height[stack_front.peek()];
            }

            else {
                stack_front.push(i);
            }
            i++;
            if (!stack_end.isEmpty() && height[j] > max_e) {

                while (!stack_end.isEmpty())
                    units = units + (max_e - height[stack_end.pop()]);

                stack_end.push(j);
                max_e = height[stack_end.peek()];
            }

            else {
                stack_end.push(j);

            }
            j--;
        }
        while (!stack_end.isEmpty()) {
            if (height[stack_end.peek()] == max_e) {
                while (!stack_end.isEmpty())
                    units = units + (max_e - height[stack_end.pop()]);
            }
            if (!stack_end.isEmpty())
                stack_end.pop();
        }
        return units;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water obj = new Trapping_Rain_Water();
        int[] nums = { 5, 5, 1, 7, 1, 1, 5, 2, 7, 6 };
        System.out.println(obj.trap(nums));
    }
}