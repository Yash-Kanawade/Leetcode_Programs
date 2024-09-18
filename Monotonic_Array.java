//Leetcode Question : 896. Monotonic Array
//An array is monotonic if it is either monotone increasing or monotone decreasing.
//An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
//Given an integer array nums, return true if the given array is monotonic, or false otherwise

public class Monotonic_Array {
    public static void main(String[] args) {
        int nums[] = {};
        int i = 1;
        if (nums.length == 1) {
            System.out.println(true);
            System.exit(0);
        }

        while (nums[i] == nums[i - 1]) {
            if (i == nums.length - 1) {
                System.out.println(true);
                System.exit(0);
            }
            i++;
        }

        if (nums[i] > nums[i - 1]) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    System.out.println(false);
                    System.exit(0);
                }
            }
        } else {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] > nums[j - 1]) {
                    System.out.println(false);
                    System.exit(0);
                }
            }
        }
        System.out.println(true);
    }
}

/**
 * Code Summary:-
 * -> The program checks whether the given array `nums` is monotonic.
 * -> An array is considered monotonic if it is either entirely non-increasing
 * or non-decreasing.
 * -> The program first skips any initial equal values, then checks whether the
 * array is increasing or decreasing.
 * -> It then ensures that the entire array maintains this trend.
 */

/**
 * Key Logic:-
 * -> First, the program skips any adjacent elements that are equal.
 * -> If the first non-equal pair is increasing, the array must continue to
 * increase; otherwise, it must decrease.
 * -> The code terminates early if a violation of monotonicity is found.
 */

/**
 * ******Time Complexity: O(n)*******
 * -> The program traverses the array `nums` once, where `n` is the length of
 * the array.
 *
 * ******Space Complexity: O(1)******
 * -> The space complexity is O(1) because no additional data structures are
 * used other than a few integer variables.
 */
