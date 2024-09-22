//Leetcode Question : 1160. Find Words That Can Be Formed by Characters

//Statement :- You are given an array of strings words and a string chars.
// A string is good if it can be formed by characters from chars (each character can only be used once).
// Return the sum of lengths of all good strings in words.

import java.util.HashMap;

public class Find_Words_That_Can_Be_Formed_by_Characters {
    public static void main(String args[]) {
        String[] words = { "cat", "bt", "hat", "tree" };
        String chars = "atach";

        // Step 1: Count occurrences of each character in 'chars'
        HashMap<Character, Integer> charcount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charcount.put(c, charcount.getOrDefault(c, 0) + 1);
        }
        System.out.println(charcount); // Debug output showing the frequency map

        int result = 0;

        // Step 2: Check for each word if it can be formed by available characters
        for (String word : words) {
            if (canformword(word, charcount)) {
                result = result + word.length(); // Add the length of the word to the result if it can be formed
            }
        }

        System.out.println(result); // Output the total length of all formable words
    }

    // Helper method to check if a word can be formed from the available characters
    public static boolean canformword(String word, HashMap<Character, Integer> charcount) {
        HashMap<Character, Integer> tempcount = new HashMap<>(charcount); // Create a temporary copy of the original
                                                                          // char count
        for (char c : word.toCharArray()) {
            // If the character exists and has a positive count, decrement it
            if (tempcount.getOrDefault(c, 0) > 0) {
                tempcount.put(c, tempcount.get(c) - 1);
            } else {
                return false; // Return false if the character isn't available or is exhausted
            }
        }
        return true; // Return true if all characters in the word can be formed
    }
}

/**
 * Code Summary:-
 * -> This program checks which words in a list can be formed using the
 * characters from a given string `chars`.
 * -> The function `canformword` determines if each word can be created by
 * comparing character frequencies.
 * -> For each word that can be formed, its length is added to the result.
 */

/**
 * Key Logic:-
 * -> A frequency map (`charcount`) is created for all the characters in the
 * string `chars`.
 * -> For each word, the program checks if it can be formed by decrementing
 * character counts in a temporary copy of the map.
 * -> If a word can be formed, its length is added to the result, which is
 * printed at the end.
 */

/**
 * ******Time Complexity: O(n * m)*******
 * -> n is the number of words in the list, and m is the average length of the
 * words.
 * -> Each word requires an O(m) operation to check if it can be formed.
 * -> Creating the character frequency map for `chars` takes O(k), where k is
 * the length of `chars`.
 * 
 * ******Space Complexity: O(k + n * m)******
 * -> O(k) for storing the character frequency of `chars`.
 * -> O(m) space is required for each temporary map `tempcount` created for
 * checking the word, leading to O(n * m) in the worst case.
 */
