//Leetcode Question : 1913. Maximum Product Difference Between Two Pairs

import java.util.Arrays;

class Maximum_Product_Difference_Between_Two_Pairs {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 }; // Input array
        Arrays.sort(nums); // Sort the array in ascending order

        // Calculate the product difference between the two largest and two smallest
        // numbers
        System.out.println(nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1]);
    }
}

/**
 * Code Summary:-
 * -> This program calculates the maximum product difference between two pairs
 * of elements in an integer array.
 * -> The difference is calculated as the product of the two largest elements
 * minus the product of the two smallest elements in the array.
 */

/**
 * Key Logic:-
 * -> The array is first sorted in ascending order.
 * -> The two largest numbers are found at the last two positions of the sorted
 * array (`nums.length - 1` and `nums.length - 2`).
 * -> The two smallest numbers are found at the first two positions of the
 * sorted array (`nums[0]` and `nums[1]`).
 * -> The result is obtained by subtracting the product of the two smallest
 * numbers from the product of the two largest numbers.
 */

/**
 * ******Time Complexity: O(n log n)*******
 * -> The time complexity is dominated by the `Arrays.sort()` method, which
 * takes O(n log n), where `n` is the length of the input array.
 * 
 * ******Space Complexity: O(1)******
 * -> The space complexity is constant (O(1)) since no additional space
 * proportional to the input size is used, except for a few variables.
 */

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
