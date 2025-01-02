//Leetcode Question : 1758. Minimum Changes To Make Alternating Binary String

public class Minimum_Changes_To_Make_Alternating_Binary_String {
    public static void main(String[] args) {
        String s = "01001"; // Input binary string
        int operations_0 = 0; // Changes to convert to "010101..."
        int operations_1 = 0; // Changes to convert to "101010..."

        // Calculate operations to match the pattern "101010..."
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '1' && s.charAt(i + 1) != '0') {
                operations_1 += 2; // If neither '1' nor '0' matches, increment by 2
                i++;
            } else if (s.charAt(i) != '1' || s.charAt(i + 1) != '0') {
                operations_1++; // If one of the two doesn't match, increment by 1
                i++;
            } else {
                i++; // Move to the next pair
            }
        }
        // Handle odd-length strings for the last character for "101010..." pattern
        if (s.length() % 2 != 0) {
            if (s.charAt(s.length() - 1) != '1') {
                operations_1++;
            }
        }

        // Calculate operations to match the pattern "010101..."
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != '0' && s.charAt(i + 1) != '1') {
                operations_0 += 2; // If neither '0' nor '1' matches, increment by 2
                i++;
            } else if (s.charAt(i) != '0' || s.charAt(i + 1) != '1') {
                operations_0++; // If one of the two doesn't match, increment by 1
                i++;
            } else {
                i++; // Move to the next pair
            }
        }
        // Handle odd-length strings for the last character for "010101..." pattern
        if (s.length() % 2 != 0) {
            if (s.charAt(s.length() - 1) != '0') {
                operations_0++;
            }
        }

        // Output the minimum operations required
        if (operations_0 < operations_1) {
            System.out.println(operations_0);
        } else {
            System.out.println(operations_1);
        }
    }
}

/**
 * Code Summary:
 * -> This program calculates the minimum number of changes required to convert
 * a binary string into an alternating binary string (either "010101..." or
 * "101010...").
 * -> It calculates two separate operations counts:
 * 1. `operations_0` to convert the string to the pattern "010101..."
 * 2. `operations_1` to convert the string to the pattern "101010..."
 * -> The minimum of these two values is the result.
 *
 * Key Logic:
 * -> The program uses two loops to check the binary string for both alternating
 * patterns ("010101..." and "101010...").
 * -> It counts the number of mismatches in both patterns and returns the
 * minimum number of operations required to convert the string to either
 * pattern.
 * -> An extra check is performed at the end for odd-length strings, to ensure
 * the last character matches the expected value.
 *
 * Time Complexity: O(n)
 * -> The program iterates through the string twice (once for each pattern).
 * This gives a time complexity of O(n), where `n` is the length of the string.
 *
 * Space Complexity: O(1)
 * -> The program uses a constant amount of extra space for storing the
 * operation counts and loop variables, resulting in O(1) space complexity.
 */
