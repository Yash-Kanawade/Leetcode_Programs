//Leetcode Question : 392. Is Subsequence
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

public class Is_Subsequence {
    public static void main(String[] args) {
        String s = "www";
        String t = "b";
        char[] b = s.toCharArray(), a = t.toCharArray();
        int j = 0;
        if (a.length == 0 && b.length == 0)
            System.out.println(true);
        else if (a.length == 0)
            System.out.println(false);
        else if (b.length == 0)
            System.out.println(true);
        if (a.length == 0 || b.length == 0)
            System.out.println(false);
        for (int i = 0; i < a.length; i++)
            if (b[j] == a[i]) {
                j++;
                if (j == b.length)
                    break;
            }
        if (j == b.length)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

// **********TIME COMPLEXITY = O(N)**********
// **********SPACE COMPLEXITY = O(1)**********

// Code Summary:-
// -> The program checks whether string `s` is a subsequence of string `t`.
// -> It converts both strings `s` and `t` into character arrays `b` and `a`
// respectively.
// -> It handles edge cases where either or both strings are empty, returning
// `true` or `false` accordingly.
// -> The program iterates through `t`, advancing a pointer `j` when characters
// in `s` match characters in `t`.
// -> If all characters in `s` are found in `t` in sequence, the program returns
// `true`, otherwise `false`.

// Key Logic:-
// -> The code uses a single pass through `t` with a pointer `j` to verify that
// all characters in `s` appear in `t` in the correct order.
// -> The condition checks and loop ensure that the program efficiently
// determines if `s` is a subsequence of `t`.
