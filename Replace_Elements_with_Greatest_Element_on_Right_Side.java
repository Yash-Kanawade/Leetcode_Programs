//Leetcode Question : 1299. Replace Elements with Greatest Element on Right Side
// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
// After doing so, return the array.

import java.util.Arrays;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int max(int i, int[] nums) {
        int maxi = nums[i];
        for (int j = i + 1; j < nums.length; j++) {
            if (maxi < nums[j])
                maxi = nums[j];
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { 400, 22 };
        Replace_Elements_with_Greatest_Element_on_Right_Side obj = new Replace_Elements_with_Greatest_Element_on_Right_Side();
        if (arr.length != 1)
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = obj.max(i, arr);
            }
        arr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}

// *****THIS CODE IS EXCEEDING TIME******
class way2 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 3, 4 };
        for (int i = 0; i < arr.length - 1; i++) {
            int[] copy = Arrays.copyOfRange(arr, i + 1, arr.length);
            Arrays.sort(copy);
            arr[i] = copy[copy.length - 1];
        }
        arr[arr.length - 1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}

// Overall Time Complexity: O(n)^2
// Overall Space Complexity:O(1) (constant space)

// Code Summary:-
// -> The program finds and replaces each element in the array arr with the
// greatest
// element to its right.
// -> The max method scans from the current index to the end of the array to
// find
// the maximum value.
// -> The replaceElements method iterates through the array, replacing each
// element
// with the max value found to its right, and sets the last element to -1.
// Key Logic:-
// -> The code efficiently finds the maximum value to the right of each element
// using
// a helper method and replaces elements accordingly.
// -> The output is an array where each element is the greatest element to its
// right,
// with the last element being -1.
