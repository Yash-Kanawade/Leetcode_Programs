//Leetcode Question : 119. Pascal's Triangle II
//Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

import java.util.ArrayList;

public class Pascals_Triangle_II {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int val = 1;
        int rowindex = 3; // Index for the Pascal's triangle row
        arr.add(1); // First element of every Pascal's triangle row is always 1

        // Calculate the rest of the row using the formula for binomial coefficients
        for (int i = 1; i <= rowindex; i++) {
            val = val * (rowindex - i + 1) / i; // Compute value using nCk formula
            arr.add(val); // Add value to the row
        }

        System.out.println(arr); // Print the row
    }
}

/**
 * Code Summary:-
 * -> This code calculates the `rowIndex`-th row of Pascal's triangle.
 * -> The first value in every row is always `1`, and each subsequent value is calculated using the binomial coefficient formula: `nCk = n! / (k! * (n-k)!)`.
 * -> The row is constructed by multiplying the previous value by `(rowIndex - i + 1) / i` in each iteration.
 */

/**
 * Key Logic:-
 * -> The first element is always added as `1` since the first element of each row in Pascal's triangle is `1`.
 * -> Each subsequent element is calculated using the binomial coefficient logic. The formula for computing the value at index `i` in row `n` is `nCk`.
 * -> The loop calculates each element in constant time by updating the previous element using the binomial coefficient formula.
 */

/**
 * ******Time Complexity: O(rowIndex)*******
 * -> The time complexity is O(rowIndex) because the program iterates `rowIndex` times to generate the elements of the row.
 *
 * ******Space Complexity: O(rowIndex)******
 * -> The space complexity is O(rowIndex) because of the array list `arr` which stores the row.
 */


// ***********Intial logic ************
// import java.util.ArrayList;
// import java.util.Arrays;

// public class Pascals_Triangle_II {
// int fact(int val) {
// int temp = 1;
// int i = 0;
// while (val != 0) {
// temp = temp * val;
// val--;
// i++;
// }
// return temp;
// }

// public static void main(String[] args) {
// int rowindex = 1;
// ArrayList<Integer> arr = new ArrayList<>();
// Pascals_Triangle_II obj = new Pascals_Triangle_II();
// if (rowindex > 1) {
// arr.add(1);
// for (int i = 1; i < rowindex; i++) {
// arr.add((((obj.fact(rowindex))) / ((obj.fact(i)) * (obj.fact(rowindex -
// i)))));
// }
// arr.add(1);
// } else {
// if (rowindex == 0)
// arr.add(1);
// else {
// arr.add(1);
// arr.add(1);
// }
// }
// System.out.println(arr);
// }
// }
