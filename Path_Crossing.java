//Leetcode Question : 1496. Path Crossing

import java.util.HashSet;

public class Path_Crossing {
    public static void main(String[] args) {
        int x = 0, y = 0; // Starting position (0, 0)
        String path = "NES"; // Example path of movements
        HashSet<String> set = new HashSet<>(); // HashSet to store visited coordinates
        set.add(x + "_" + y); // Add starting position to the set

        // Iterating through the path to check if a position is revisited
        for (int i = 0; i < path.length(); i++) {
            // Moving according to the character in the path string
            if (path.charAt(i) == 'N') {
                y++; // Move north (increment y)
            } else if (path.charAt(i) == 'S') {
                y--; // Move south (decrement y)
            } else if (path.charAt(i) == 'E') {
                x++; // Move east (increment x)
            } else { // 'W' for west
                x--; // Move west (decrement x)
            }

            // Check if the current coordinate is already visited
            if (set.contains(x + "_" + y)) {
                System.out.println("true"); // If visited, print true
                System.exit(0); // Exit the program
            }

            // Add the new position to the set
            set.add(x + "_" + y);
        }

        // If no position is revisited, print false
        System.out.println("false");
    }
}

/**
 * Code Summary:
 * -> This program checks if a path (represented by directions 'N', 'S', 'E',
 * 'W') crosses itself, meaning it visits the same position more than once.
 * -> It tracks the coordinates (x, y) as the path is traversed and uses a
 * HashSet to store visited positions.
 * -> If a position is revisited, the program prints `true` and exits;
 * otherwise, it prints `false` after the loop completes.
 */

/**
 * Key Logic:
 * -> The key logic is to maintain a HashSet of strings representing the
 * coordinates "x_y".
 * -> For each move ('N', 'S', 'E', 'W'), the current coordinates are updated,
 * and then the program checks if the new coordinates are already in the set.
 * -> If a coordinate is already in the set, it means the path has crossed
 * itself.
 */

/**
 * ******Time Complexity: O(n)*******
 * -> The program iterates through the `path` string of length `n`, and each
 * check/add operation in the HashSet takes O(1) on average.
 * -> Hence, the overall time complexity is O(n), where `n` is the length of the
 * path.
 * 
 * ******Space Complexity: O(n)*******
 * -> The space complexity is O(n) because the program stores up to `n` distinct
 * coordinates in the HashSet, where `n` is the length of the path.
 */
