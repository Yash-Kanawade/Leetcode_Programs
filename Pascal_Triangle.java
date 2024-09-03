//Leetcode Question - 118. Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int numRows = 0;
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    temp.add(1);
                else
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.add(temp);
        }
        System.out.println(result);
    }
}

// Time Complexity: O(numRows^2)
// Space Complexity: O(numRows^2)

/*
 * Code Summary:-
 * -> The program generates Pascal's Triangle with a specified number of rows
 * (`numRows`).
 * -> It initializes an empty list of lists `result` to store the rows of the
 * triangle.
 * -> The outer loop iterates over the number of rows.
 * -> For each row, a temporary list `temp` is created to store the elements of
 * that row.
 * -> The inner loop fills in the elements of the current row:
 * -> It adds `1` at the beginning and end of each row.
 * -> It computes the inner elements as the sum of two elements directly above
 * from the previous row.
 * -> Each completed row (`temp`) is added to the `result` list.
 * -> Finally, the entire Pascal's Triangle is printed.
 */

/*
 * Key Logic:-
 * -> The code uses dynamic programming to build each row based on the values
 * from the previous row.
 * -> The outer loop controls the number of rows, while the inner loop fills in
 * the values for each row.
 * -> The result is a list of lists representing Pascal's Triangle up to the
 * specified number of rows.
 */
