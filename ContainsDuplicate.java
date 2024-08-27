//217. Contains Duplicate
// Given an integer array nums, return true if any value appears at
// least twice in the array, and return false if every element is distinct.

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 8, 5, 4, 4 }; // You can take nums array of any type you want,I have just taken this input
                                           // in order to run code
        boolean flag = false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            if (nums[i] == nums[i - 1])
                flag = true;
        System.out.println(flag);
    }
}

// Code Summary:-
// ->The program checks for duplicates in an integer array.
// ->It initializes an array nums and sorts it using Arrays.sort().
// ->A flag (flag) is used to track if duplicates are found.
// ->It iterates through the sorted array, comparing each element to the
// previous one.
// ->If a duplicate is detected (i.e., two adjacent elements are equal), flag is
// set to true.
// ->Finally, it prints the value of flag, indicating the presence of
// duplicates.

// Key Logic:-
// ->Sorting the array allows adjacent duplicates to be easily detected.
// ->The time complexity is dominated by the sorting step, making it O(n log n).