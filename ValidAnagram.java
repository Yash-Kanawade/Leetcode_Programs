// Leetcode Question : 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char[] a = s.toCharArray(), b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a).equals(Arrays.toString(b)));
    }
}

// Code Summary:-
// ->The program checks if two strings (s and t) are anagrams of each other.
// ->It converts both strings to character arrays (a and b) using toCharArray().
// ->The character arrays are then sorted using Arrays.sort().
// ->Finally, it compares the sorted arrays by converting them back to strings
// with Arrays.toString() and checks for equality.
// Key Logic:-
// ->If the sorted character arrays of the two strings are equal, the strings
// are anagrams; otherwise, they are not.
// ->The time complexity of this approach is O(n log n) due to the sorting step.