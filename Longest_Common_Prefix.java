//Leetcode Question : 14. Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] s = { "flower", "flow", "flight" };
        if (s.length == 0)
            System.out.println("break");
        int min = s[0].length();
        for (int i = 1; i < s.length; i++) {
            int j = 0;
            while (s[i - 1].length() > j && s[i].length() > j) {
                if (s[i - 1].charAt(j) != s[i].charAt(j))
                    break;
                j++;
            }
            if ((min) > j)
                min = j;
            if (min == 0)
                break;
        }
        System.out.println(s[0].substring(0, min));
    }

}

// ******TIME COMPLEXITY = O(N*M)******
// ******SPACE COMPLEXITY = O(1)*******

/*
 * Code Summary:-
 * -> The program finds the longest common prefix among an array of strings
 * `strs`.
 * -> If the array is empty, it returns an empty string.
 * -> It initializes `min` to the length of the first string to keep track of
 * the shortest common prefix length.
 * -> The outer loop iterates through the array starting from the second string.
 * -> The inner `while` loop compares characters of the current string with the
 * previous string until a mismatch is found or the end of either string is
 * reached.
 * -> The minimum length of the common prefix is updated based on the
 * comparisons.
 * -> Finally, it returns the substring of the first string from index `0` to
 * `min`.
 */

/*
 * Key Logic:-
 * -> The code efficiently determines the longest common prefix by comparing
 * adjacent strings in the array.
 * -> The use of two loops allows for direct comparison of characters until a
 * mismatch occurs.
 * -> The final prefix is extracted from the first string based on the
 * calculated minimum length.
 */