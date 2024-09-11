//Leetcode Question : 448. Find All Numbers Disappeared in an Array
//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.HashSet;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] nums = { 0, 0 };
        HashSet<Integer> arr = new HashSet<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!(arr.contains(i)))
                result.add(i);
        }
        System.out.println(result);
    }
}

/*
 * Code Summary:
 * -> The class `Find_All_Numbers_Disappeared_in_an_Array` finds all numbers
 * that are missing from the array `nums` in the range [1, n].
 * -> The method iterates over the array `nums` to populate a `HashSet`
 * with the unique numbers found in the array.
 * -> It then checks which numbers from `1` to `n` are not present in the
 * `HashSet` and adds these missing numbers to the `result` list.
 */

/*
 * Key Logic:
 * -> The first loop adds all elements from the array `nums` into the `HashSet`.
 * -> The second loop iterates from `1` to `nums.length` and checks if each
 * number
 * is present in the `HashSet`. Missing numbers are added to the `result` list.
 */

// Time Complexity: O(n)
// -> The first loop inserts elements into the HashSet, and the second loop
// checks each number from 1 to n for presence in the HashSet.

// Space Complexity: O(n)
// -> The HashSet stores up to n elements, and the ArrayList stores missing
// numbers,
// which can also be up to n in the worst case.

// *****MY OLDER APPROCH WHICH TAKE TIME COMPLEXITY OF O(n2) ******/

// public class Find_All_Numbers_Disappeared_in_an_Array {
// public static void main(String[] args) {
// int[] nums = { 0, 2 };
// ArrayList arr = new ArrayList<Integer>();
// int j = 1;
// boolean flag = false;
// while (j != nums.length + 1) {
// flag = false;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] == j) {
// flag = true;
// nums[i] = 0;
// break;
// }
// }
// if (flag == false) {
// arr.add(j);
// }
// j++;
// }
// System.out.println(arr);

// }
// }