//Leetcode Question : 1422. Maximum Score After Splitting a String

public class Maximum_Score_After_Splitting_a_String {
    public static void main(String[] args) {
        String s = "011101";
        int leftcount = 0, total1 = 0, maxscore = 0, score = 0;

        // Counting total number of '1's in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                total1++;
        }

        // Looping through the string and calculating score by counting 0's on the left
        // and subtracting 1's on the right
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                total1--; // Subtract '1's from the right
            } else {
                leftcount++; // Count '0's on the left
            }
            score = leftcount + total1; // Calculate the score
            if (maxscore < score)
                maxscore = score; // Update max score
        }

        System.out.println(maxscore); // Output the maximum score
    }
}

/**
 * Code Summary:
 * -> This program calculates the maximum score after splitting a binary string
 * at different positions.
 * -> The score is defined as the number of 0's on the left of the split plus
 * the number of 1's on the right.
 */

/**
 * Key Logic:
 * -> The first loop counts the total number of '1's in the string.
 * -> The second loop iterates through the string and updates the score by
 * counting the 0's on the left and subtracting the 1's on the right.
 * -> The max score is updated at each split.
 */

/**
 * ******Time Complexity: O(n)*******
 * -> The program runs two loops over the string with length `n`, making the
 * time complexity O(n).
 *
 * ******Space Complexity: O(1)******
 * -> The space complexity is O(1) since only a few integer variables are used
 * for counting, and no additional data structures are needed.
 */
