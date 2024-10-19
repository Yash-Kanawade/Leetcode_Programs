//Leetcode Question : 1897. Redistribute Characters to Make All Strings Equal

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Redistribute_Characters_to_Make_All_strings_Equal {
    public static void main(String[] args) {
        String[] words = { "abc", "aabc", "bc" };
        int count[] = new int[26];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                count[words[i].charAt(j) - 'a']++;
            }
        }
        for (int i : count) {
            if (i != 0) {
                if (i % words.length != 0) {
                    System.out.println(false);
                    System.exit(0);
                }
            }
        }
        System.out.println(true);
    }
}

/**
 * Code Summary:
 * -> This program checks whether the characters of the given words can be
 * redistributed such that each word contains the same characters.
 * -> It counts the occurrences of each character and checks if the frequency is
 * divisible by the number of words.
 *
 * Key Logic:
 * -> For each character, the total count across all words is calculated.
 * -> If any character's total count is not divisible by the number of words, it
 * means equal distribution is not possible.
 *
 * Time Complexity: O(n)
 * -> The time complexity is O(n), where n is the total number of characters in
 * all words.
 *
 * Space Complexity: O(1)
 * -> The space complexity is O(1) because the character count array has a fixed
 * size of 26, regardless of the input size.
 */

// Another logic / solution using hashmap
// public static void main(String[] args) {
// String[] words = { "abc", "aabc", "bc" };
// HashMap<Character, Integer> map1 = new HashMap<>();
// for (int i = 0; i < words.length; i++) {
// for (int j = 0; j < words[i].length(); j++) {
// map1.put(words[i].charAt(j), (map1.getOrDefault(words[i].charAt(j), 0) + 1));
// }
// }
// System.out.println(map1);
// for (Integer value : map1.values()) {
// if (value % words.length != 0)
// System.out.println(false);
// }
