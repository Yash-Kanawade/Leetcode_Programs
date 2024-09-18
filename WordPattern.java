//Leetcode Question : 290. Word Pattern
//Given a pattern and a string s, find if s follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
// Each letter in pattern maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aba";
        String s = "dog dog dog dog";
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            System.out.println(false);
            System.exit(0);
        }

        HashMap<Character, String> chartoword = new HashMap<>();
        HashMap<String, Character> wordtochar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = arr[i];

            if (chartoword.containsKey(c)) {
                if (!(chartoword.get(c).equals(word))) {
                    System.out.println(false);
                    System.exit(0);
                }
            } else if (wordtochar.containsKey(word)) {
                if (!(wordtochar.get(word).equals(c))) {
                    System.out.println(false);
                    System.exit(0);
                }
            } else {
                chartoword.put(c, word);
                wordtochar.put(word, c);
            }
        }

        System.out.println(true);
    }
}

/**
 * Code Summary:-
 * -> The program checks if the given string `s` follows the same pattern as
 * described in `pattern`.
 * -> Two hash maps are used to establish a one-to-one mapping between
 * characters in `pattern` and words in `s`.
 * -> The program exits early if a mismatch is found between the pattern and the
 * word arrangement in `s`.
 */

/**
 * Key Logic:-
 * -> The code uses two hash maps:
 * - `chartoword`: Maps characters from `pattern` to words from `s`.
 * - `wordtochar`: Maps words from `s` back to characters in `pattern`.
 * -> The pattern is validated by checking the consistent mapping of characters
 * and words.
 */

/**
 * ******Time Complexity: O(n)*******
 * -> The program iterates through the `pattern` and `s` once, where `n` is the
 * length of `pattern` or `s` (since they are of equal length).
 *
 * ******Space Complexity: O(n)******
 * -> The space complexity is O(n) for the two hash maps, as they store mappings
 * for all characters and words.
 */
