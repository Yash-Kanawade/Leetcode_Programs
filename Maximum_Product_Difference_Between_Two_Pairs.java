import java.util.Arrays;

class Maximum_Product_Difference_Between_Two_Pairs {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1]);
    }
}

// Another method with time complexity O(n)
// public class Maximum_Product_Difference_Between_Two_Pairs {
// public static void main(String[] args) {
// int[] nums = { 5, 6, 2, 7, 4 };
// int min = Integer.MAX_VALUE, max = 0, min2 = Integer.MAX_VALUE, max2 = 0;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] > max) {
// max2 = max;
// max = nums[i];
// } else if (nums[i] <= max)
// if (max2 < nums[i])
// max2 = nums[i];
// if (nums[i] < min) {
// min2 = min;
// min = nums[i];
// } else if (nums[i] >= min)
// if (nums[i] < min2)
// min2 = nums[i];
// }
// System.out.println(max * max2 - min * min2);
// }
// }
