//Leetcode Question : 645. Set Mismatch

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] store = new int[nums.length + 1];
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            store[nums[i]]++;
        }
        for (int i = 1; i < store.length; i++) {
            if (store[i] == 2) {
                result[0] = i;
            } else if (store[i] == 0) {
                result[1] = i;
            }
        }
        System.out.println(Arrays.toString(store));
        System.out.println(Arrays.toString(result));
    }
}

/**
 * Code Summary:
 * -> This program identifies the duplicate and missing numbers in an array of
 * integers where one number appears twice and another is missing.
 * -> The program uses an auxiliary array `store` to count the occurrences of
 * each number.
 *
 * Key Logic:
 * -> The `store` array is used to track the count of each number. The number
 * that appears twice is the duplicate, and the number with a count of zero is
 * the missing number.
 *
 * Time Complexity: O(n)
 * -> The time complexity is O(n), where n is the length of the input array. The
 * array is traversed twice: once to populate the `store` array and once to
 * identify the duplicate and missing numbers.
 *
 * Space Complexity: O(n)
 * -> The space complexity is O(n) because an extra array `store` is used, which
 * has a size proportional to the input array.
 */