//Leetcode Question : 496. Next Greater Element I
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
// You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
// Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

import java.util.Arrays;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] nums2 = { 1, 2 }; // Full list
        int[] nums1 = { 1, 2 }; // Subset for which we need to find next greater element
        int[] ans = new int[nums1.length]; // Result array

        // Step 1: For each element in nums1, find the next greater element in nums2
        for (int i = 0; i < nums1.length; i++) {
            int element = nums1[i];
            boolean found = false;
            ans[i] = -1; // Default to -1 if no greater element is found

            // Step 2: Find the index of nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == element) {
                    // Step 3: Look for the next greater element to the right in nums2
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > element) {
                            ans[i] = nums2[k]; // Assign next greater element
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break; // Exit inner loop once next greater element is found
                    }
                }
            }
        }

        // Print the result
        System.out.println(Arrays.toString(ans));
    }
}

// Time Complexity: O(m * n)
// Space Complexity: O(m)

/*
 * Code Summary:-
 * -> The program finds the next greater element for each element in `nums1`
 * within the array `nums2`.
 * -> If no greater element is found in `nums2`, the result is set to -1 for
 * that element.
 */

/*
 * Key Logic:-
 * -> The code first identifies the index of each element in `nums1` within
 * `nums2`.
 * -> Then, it looks for the next greater element to the right of that index in
 * `nums2`. If found, it assigns that element to `ans[]`, otherwise it defaults
 * to -1.
 */