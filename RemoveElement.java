//Leetcode Question : 27. Remove Element
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.

class RemoveElement {
    public static void main(String[] args) {
        int j = 0, val = 3;
        int nums[] = { 3, 2, 2, 3 };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(j);
    }
}

// Code Summary:-
// ->The program removes all occurrences of a specified value (val) from an
// integer array (nums).
// ->It initializes an array nums and a variable j to track the position for
// non-val elements.
// ->A for loop iterates through the array:
// ->If the current element (nums[i]) is not equal to val, it swaps it with the
// element at index j, then increments j.
// ->Enter processing the array, the value of j indicates the new length of the
// array without the specified value.
// ->key Logic:-
// ->The code uses a two-pointer technique to rearrange the array in-place.
// ->The final count of non-val elements is printed, which is stored in j.