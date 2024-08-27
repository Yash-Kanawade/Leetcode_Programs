// Leetcode Question : 26. Remove Duplicates from Sorted Array
// Easy
// Topics
// Companies
// Hint
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

// Code Summary:-
// -> The method removes duplicates from a sorted integer array (nums) in-place
// and returns the new length of the array.
// -> It first checks if the array is empty. If so, it returns 0.
// -> It initializes a counter k to track the index of unique elements.
// -> A for loop iterates through the array starting from the second element:
// -> If the current element (nums[i]) is different from the previous element
// (nums[i - 1]), it assigns the current element to nums[k] and increments k.
// -> After processing, it returns k, which represents the count of unique
// elements in the array.
// Key Logic:-
// -> The solution efficiently uses a single pass through the array with a time
// complexity of O(n), maintaining the order of elements.
// ->It modifies the original array to contain only unique elements up to the
// new length.
