//Leetcode Question -169. Majority Element
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

//APPROCH 1 : BOYER MOORE VOTING ALGORITHM

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2 };
        int count = 1, i = 1;
        if (nums.length == 0) {
            System.out.println(0);
            System.exit(0);
        }
        int candidate = nums[0];
        while (i < nums.length) {
            if (count == 0)
                candidate = nums[i];
            if (candidate == nums[i]) {
                count++;
            }
            if (candidate != nums[i])
                count--;
            i++;
        }
        System.out.println(candidate);
    }
}

// ******TIME COMPLEXITY FOR APPROCH1 - O(n) ******/
// ******SPACE COMPLEXITY FOR APPROCH1- O(1) ******/

// APPROCH 2 : SORTING OF ARRAYS

class approch2 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        Arrays.sort(nums);
        System.out.println(nums[nums.length / 2]);
    }
}

// APPROCH 1 :- Explanation
/*
 * Code Summary:-
 * -> The program finds the majority element in the array `nums`, which is the
 * element that appears more than `n/2` times.
 * -> It uses the Boyer-Moore Voting Algorithm to achieve this in linear time
 * and constant space.
 * -> The code starts by setting the first element of the array as the
 * `candidate` for the majority element.
 * -> It iterates through the array:
 * -> If the `count` is 0, it sets the current element as the new candidate.
 * -> If the current element matches the `candidate`, it increments `count`.
 * -> If the current element does not match the `candidate`, it decrements
 * `count`.
 * -> By the end of the loop, the `candidate` will be the majority element.
 * -> Finally, the majority element is printed.
 */

/*
 * Key Logic:-
 * -> The Boyer-Moore Voting Algorithm works by maintaining a `candidate` and a
 * `count`. The candidate is reset when the count reaches 0, and the majority
 * element will survive as the final candidate because it appears more than
 * `n/2` times.
 */