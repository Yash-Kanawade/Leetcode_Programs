//Leetcode Question : 724. Find Pivot Index
// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 2 };
        int leftcount = 0, totalsum = 0;

        /*
         * Code Summary:-
         * -> The program finds the pivot index in the array `nums`, where the sum of
         * the elements to the left of the pivot is equal to the sum of the elements to
         * the right.
         * -> If no such index exists, it prints -1.
         */

        // Step 1: Calculate the total sum of the array
        for (int i = 0; i < nums.length; i++)
            totalsum = totalsum + nums[i];

        // Step 2: Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Check if the left sum equals the right sum
            if (leftcount == totalsum - nums[i] - leftcount) {
                System.out.println(i); // Print the pivot index
                System.exit(0); // Exit after finding the pivot
            }
            // Increment the left sum by the current element
            leftcount = leftcount + nums[i];
        }

        // If no pivot index is found, print -1
        System.out.println(-1);

        /*
         * Key Logic:-
         * -> The code maintains a running sum `leftcount` of the elements to the left
         * of the current index.
         * -> It checks if this left sum is equal to the right sum (which is derived
         * from the total sum).
         * -> If they are equal, the current index is the pivot index.
         */
    }
}

// ******Time Complexity: O(n)*******
// ******Space Complexity: O(1)******