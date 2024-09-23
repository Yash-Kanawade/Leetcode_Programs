//Leetcode Question : 2264. Largest 3-Same-Digit Number in String
/*Problem Statement :- You are given a string num representing a large integer. An integer is good if it meets the following conditions:
                    It is a substring of num with length 3.
                    It consists of only one unique digit.
                    Return the maximum good integer as a string or an empty string "" if no such integer exists.*/

public class Largest_3_Same_Digit_Number_in_String {
    public static void main(String[] args) {
        String num = "1221000"; // Input string containing digits
        int count = 1, result = -1; // Initialize variables: count of consecutive digits and the largest result
        String out = ""; // Initialize an empty string to store the largest 3-digit number

        // Loop through the string starting from the second character
        for (int i = 1; i < num.length(); i++) {
            // If the current digit is different from the previous one, reset the count
            if (num.charAt(i) != num.charAt(i - 1)) {
                count = 1;
            } else {
                count++; // Increment count if the current digit matches the previous one
                if (count == 3) { // Check if we have found 3 consecutive same digits
                    count = 1; // Reset count for next potential match
                    // Check if this 3-digit number is larger than the previous largest one
                    if (result < Character.getNumericValue(num.charAt(i))) {
                        result = Character.getNumericValue(num.charAt(i)); // Update the result
                        out = num.substring(i - 2, i + 1); // Extract the 3-digit number
                    }
                }
            }
        }
        System.out.println(out); // Output the largest 3-digit same number
    }
}

/**
 * Code Summary:-
 * -> This program scans through a string `num` to find the largest 3-digit
 * number formed by three consecutive same digits.
 * -> It uses a loop to count consecutive matching digits and stores the largest
 * 3-digit same number.
 */

/**
 * Key Logic:-
 * -> The loop increments the count for matching digits, and when the count
 * reaches 3, it checks if the 3-digit number is the largest so far.
 * -> The largest 3-digit same number is stored in the `out` variable, which is
 * printed at the end.
 */

/**
 * ******Time Complexity: O(n)*******
 * -> The code loops through the string `num` once, where `n` is the length of
 * the string.
 * -> All operations inside the loop take constant time, so the overall time
 * complexity is O(n).
 * 
 * ******Space Complexity: O(1)******
 * -> The space complexity is constant (O(1)) because no additional space is
 * used that scales with the input size.
 * -> The string `out` stores the result, and a few variables are used, all of
 * which take constant space.
 */
