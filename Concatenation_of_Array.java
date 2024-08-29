//Leetcode Question : 1929. Concatenation of Array
// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans.

import java.util.Arrays;
import java.util.stream.IntStream;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] result = IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
        System.out.println(Arrays.toString(result));
    }
}

// **************************************************************************************
// */
// Another way of solving question without using predefined function in java
// public class Concatenation_of_Array {
// public static void main(String[] args) {
// int[] nums = { };
// int[] result = new int[2 * nums.length];
// int j = 0, i = 0;
// for (i = 0; i < nums.length; i++) {
// result[j] = nums[i];
// j++;
// if (j == nums.length)
// i = -1;
// }
// System.out.println(Arrays.toString(result));
// }
// }
// ****************************************************************************************
// */

// Code Summary:-
// ->The program concatenates an array nums with itself, effectively doubling
// the array.
// ->IntStream.concat combines two streams of the same array (nums) and converts
// the result back into an array using toArray().
// ->Finally, the concatenated array is printed using Arrays.toString().
// Key Logic:-
// ->The code utilizes Java Streams to efficiently concatenate the array with
// itself.
// ->The output is an array that repeats the original sequence, in this case
// resulting in [1, 2, 1, 1, 2, 1]
