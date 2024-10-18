//Leetcode Question : 15. 3Sum

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class _3sum {
    public static void main(String[] args) {
        int nums[] = { -2, 0, 0, 2, 2 };
        Arrays.sort(nums);
        List<List<Integer>> result_list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    result_list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    right--;
                    left++;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        System.out.println(result_list);
    }
}

/**
 * Code Summary:
 * -> This program finds all unique triplets in the array that sum to zero.
 * -> The input array is first sorted, and a two-pointer technique is used to
 * find combinations of three numbers.
 * -> Duplicates are skipped to ensure the triplets are unique.
 *
 * Key Logic:
 * -> The two-pointer technique is applied to the sorted array to efficiently
 * find triplets that sum to zero.
 * -> After finding a valid triplet, both pointers are adjusted to skip over
 * duplicate values.
 *
 * Time Complexity: O(n^2)
 * -> Sorting the array takes O(n log n).
 * -> The nested loop to find triplets with two-pointer traversal takes O(n^2),
 * resulting in an overall time complexity of O(n^2).
 *
 * Space Complexity: O(n)
 * -> The space complexity is O(n) for storing the result list of triplets,
 * where n is the number of elements in the array.
 */