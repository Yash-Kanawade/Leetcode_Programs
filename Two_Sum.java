//Leetcode Question : 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 11, 3 };
        int out[] = new int[2];
        int target = 6;
        for (int j = 0; j < nums.length; j++) {
            for (int i = j + 1; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    out[0] = i;
                    out[1] = j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(out));
    }

}

// Time Complexity : O(N^2)
// Space Complexity : O(1)

// Code Summary:-
// ->The program finds two indices of elements in an integer array (nums) that
// sum up to a specified target value.
// ->It initializes an output array (out) to store the indices and sets the
// target sum to 6.
// ->The nested for loops iterate through the array:
// ->The outer loop (j) selects an element, and the inner loop (i) checks the
// subsequent elements.
// ->If the sum of the selected elements equals the target, their indices are
// stored in the out array.
// ->Finally, it prints the indices of the two elements that sum to the target.
// Key Logic
// ->The solution uses a brute-force approach with a time complexity of O(n²),
// checking every pair of elements.
// ->The indices of the two elements that sum to the target are outputted as an
// array.
