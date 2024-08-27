import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 8, 5, 4, 4 };
        boolean flag = false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            if (nums[i] == nums[i - 1])
                flag = true;
        System.out.println(flag);
        System.out.println("hello");
    }
}
