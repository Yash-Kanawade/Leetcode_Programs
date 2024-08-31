//Leetcode Question: 58. Length of Last Word
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

public class Length_of_last_word {
    public static void main(String[] args) {
        String s = "  ";
        int i = s.length() - 1, count = 0;
        if (s.length() == 0)
            System.out.println(0);
        while (s.charAt(i) == ' ' && i != 0) {
            i--;
        }
        while (i != -1 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        System.out.println(count);
    }
}

// *******ANOTHER METHOD*******
/*
 * public class Length_of_last_word {
 * public static void main(String[] args) {
 * String s = "hello world";
 * String[] a = s.split(" ");
 * s = a[a.length - 1];
 * System.out.println(s.length());
 * }
 * }
 */

// TIME COMPLEXITY = O(n)
// SPACE COMPLEXITY = O(1)
// THIS IS FOR THE FIRST CODE

/*
 * Code Summary:-
 * -> The program calculates the length of the last word in a given string `s`.
 * -> It initializes `i` to the last index of the string and `count` to 0 to
 * track the length of the last word.
 * -> If the string is empty, it immediately prints `0`.
 * -> The first `while` loop skips any trailing spaces at the end of the string.
 * -> The second `while` loop counts the characters of the last word by
 * iterating backward until a space is encountered or the start of the string is
 * reached.
 * -> Finally, it prints the length of the last word.
 */

/*
 * Key Logic:-
 * -> The code efficiently handles trailing spaces and empty strings by skipping
 * unnecessary characters.
 * -> It calculates the length of the last word by counting characters from the
 * end of the string until it hits a space or the beginning.
 */