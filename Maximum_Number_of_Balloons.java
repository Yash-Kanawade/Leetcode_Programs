//Leetcode Question -1189. Maximum Number of Balloons
//Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
//You can use each character in text at most once. Return the maximum number of instances that can be formed

import java.util.ArrayList;
import java.util.Arrays;

class Maximum_Number_of_Balloons {
    public static void main(String[] args) {
        String text = "nlaebolko";
        int[] count = new int[26]; // To store the count of each character (a-z)

        /*
         * Code Summary:-
         * -> The program finds how many times the word 'balloon' can be formed using
         * the characters in the string `text`.
         */

        // List of characters that form the word 'balloon'
        ArrayList<Character> arr = new ArrayList<>();
        arr.add('b');
        arr.add('a');
        arr.add('l');
        arr.add('n');
        arr.add('o');

        // Step 1: Count the occurrences of relevant characters in the string
        for (int i = 0; i < text.length(); i++) {
            if (arr.contains(text.charAt(i)))
                count[text.charAt(i) - 'a']++; // Increment character count
        }

        // Step 2: Calculate how many times 'balloon' can be formed
        // 'b' occurs once, 'a' occurs once, 'l' and 'o' occur twice, 'n' occurs once
        int balloonCount = Integer.MAX_VALUE; // Start with a large number for min calculation

        // Step 3: Use the minimum count of the necessary letters to determine the
        // number of 'balloon's that can be formed
        balloonCount = Math.min(balloonCount, count['b' - 'a']); // Count of 'b'
        balloonCount = Math.min(balloonCount, count['a' - 'a']); // Count of 'a'
        balloonCount = Math.min(balloonCount, count['l' - 'a'] / 2); // Count of 'l' (divided by 2)
        balloonCount = Math.min(balloonCount, count['o' - 'a'] / 2); // Count of 'o' (divided by 2)
        balloonCount = Math.min(balloonCount, count['n' - 'a']); // Count of 'n'

        // Step 4: Output the result
        System.out.println("Maximum number of 'balloon' that can be formed: " + balloonCount);

        /*
         * Key Logic:-
         * -> The code counts the relevant characters in the input string and checks how
         * many times 'balloon' can be formed by dividing the counts of 'l' and 'o' by
         * 2.
         */
    }
}

// *********Time Complexity = O(n)********;
// ********Space Complexity = O(1)********;
