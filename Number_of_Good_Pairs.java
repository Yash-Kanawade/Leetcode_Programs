//Leetcode Question : 1512. Number of Good Pairs

import java.util.HashMap;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        int[] nums = {};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number in nums
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.computeIfPresent(nums[i], (key, value) -> value + 1); // Increment count
            } else {
                map.put(nums[i], 1); // Initialize count for the number
            }
        }

        int count = 0;

        // Calculate the number of good pairs
        for (int val : map.values()) {
            if (val > 1) {
                val = val - 1;
                count = count + ((val * (val + 1)) / 2); // Compute pairs
            }
        }

        System.out.println(map); // Print the frequency map
        System.out.println(count); // Print the number of good pairs
    }
}

/**
 * Code Summary:-
 * -> The program counts the number of "good pairs" in the array `nums`.
 * -> A "good pair" is a pair of indices `(i, j)` such that `nums[i] == nums[j]`
 * and `i < j`.
 * -> The program first counts the frequency of each element, then calculates
 * the number of good pairs for any element that appears more than once.
 */

/**
 * Key Logic:-
 * -> For each number, the frequency is stored in a HashMap.
 * -> If a number occurs more than once, the number of good pairs it forms is
 * calculated using the formula for combinations of 2 (nC2) from the frequency
 * count.
 * -> The formula `(val * (val + 1)) / 2` is used to find the number of good
 * pairs when `val > 1`.
 */

/**
 * ******Time Complexity: O(n)*******
 * -> The time complexity is O(n), where `n` is the length of the array `nums`.
 * This is because we traverse the array twice—once to build the frequency map,
 * and once to compute the number of good pairs.
 *
 * ******Space Complexity: O(n)******
 * -> The space complexity is O(n) because of the storage used by the HashMap to
 * store the frequency of each element.
 */

// Best solution -----:
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}