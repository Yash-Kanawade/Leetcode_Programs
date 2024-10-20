//Leetcode Question : 1624. Largest Substring Between Two Equal Characters

import java.util.HashMap;

public class LarSubstring_Between_Two_Equal_Characters {
    public static void main(String[] args) {
        String s = "abca";
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int dis = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (map.containsKey(s.charAt(i))) {
                if (dis < ((count - 1) - map.get(s.charAt(i))))
                    dis = (count - 1) - map.get(s.charAt(i));
                flag = true;
            } else {
                map.put(s.charAt(i), count);
            }
        }
        if (flag == true) {
            System.out.println(dis);
            System.exit(0);
        } else
            System.out.println(-1);
    }
}

/**
 * Code Summary:
 * -> This program finds the largest substring between two equal characters in a
 * given string.
 * -> It uses a HashMap to track the first occurrence of each character and
 * calculates the distance between two equal characters.
 *
 * Key Logic:
 * -> For each character, if it already exists in the map, the distance between
 * its current index and its previous index is calculated.
 * -> The largest distance is stored and updated as we traverse the string.
 *
 * Time Complexity: O(n)
 * -> The time complexity is O(n), where n is the length of the string. Each
 * character is processed once, and checking/inserting in the HashMap takes O(1)
 * on average.
 *
 * Space Complexity: O(1)
 * -> The space complexity is O(1), as the HashMap stores at most 26 characters
 * (for lowercase alphabets).
 */