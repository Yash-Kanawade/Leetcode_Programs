// Leetcode Question : 303. Range Sum Query - Immutable
// Given an integer array nums, handle multiple queries of the following type:
// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the Range_Sum_Query_Immutable class:
// Range_Sum_Query_Immutable(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).

class Range_Sum_Query_Immutable {

    private int[] prefixsum;

    public Range_Sum_Query_Immutable(int[] nums) {
        // Constructor
        prefixsum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefixsum[i] = nums[i]; // Copy elements of nums to prefixsum
        }
    }

    public int sumRange(int left, int right) {
        // Sum of all elements in the given range
        int add = 0;
        for (int i = left; i <= right; i++) {
            add = add + prefixsum[i];
        }
        return add;
    }
}

/**
 * Your Range_Sum_Query_Immutable object will be instantiated and called as
 * such:
 * Range_Sum_Query_Immutable obj = new Range_Sum_Query_Immutable(nums);
 * int param_1 = obj.sumRange(left,right);
 */

/*
 * Code Summary:-
 * -> The class `Range_Sum_Query_Immutable` handles multiple sum queries on the
 * array `nums`.
 * -> A copy of `nums` is stored in `prefixsum` for later use in sum queries.
 * -> The method `sumRange` iterates over the range from `left` to `right` and
 * computes the sum.
 */

/*
 * Key Logic:-
 * -> The constructor copies elements from `nums` to `prefixsum`.
 * -> The `sumRange` method loops through the indices from `left` to `right`
 * inclusively and computes the sum.
 */

/*
 * ******Time Complexity: O(1)*******
 * -> For each query, the program iterates through the range [left, right].
 *
 * ******Space Complexity: O(n)******
 * -> The space complexity is O(n) due to the storage of the `prefixsum` array.
 */
