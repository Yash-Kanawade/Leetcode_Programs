//Leetcode Question : 1436. Destination City

import java.util.ArrayList;
import java.util.HashSet;

public class Destination_City {
    public static void main(String[] args) {
        // Initializing a list of city paths
        ArrayList<ArrayList<String>> paths = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();

        // Adding city pairs (from, to)
        city.add("London");
        city.add("New York");
        paths.add(city2);
        city2.add("New York");
        city2.add("Lima");
        city3.add("Lima");
        city3.add("Sao Paulo");
        paths.add(city3);
        paths.add(city);

        System.out.println(paths); // Debugging step: print all city paths

        // Copying the first path from the list
        ArrayList<String> str2 = new ArrayList<>();
        str2.add(paths.get(0).get(0));
        str2.add(paths.get(0).get(1));
        paths.remove(0);

        // Processing the paths to find the destination city
        while (paths.size() != 0) {
            int j = 0;
            while (j < paths.size()) {
                if (str2.contains(paths.get(j).get(0))) {
                    // If the starting city of a path is already in str2, add its destination city
                    // to str2
                    str2.add(paths.get(j).get(1));
                    paths.remove(j);
                } else if (str2.contains(paths.get(j).get(1))) {
                    // If the destination city of a path is in str2, insert its starting city before
                    // it
                    int index = str2.indexOf(paths.get(j).get(1));
                    str2.add(index, paths.get(j).get(0));
                    paths.remove(j);
                }
                j++;
            }
        }

        // Printing the destination city (last city in the list)
        System.out.println(str2.get(str2.size() - 1));
    }
}

/**
 * Code Summary:-
 * -> This program finds the final destination city by processing a list of
 * city-to-city paths.
 * -> It uses a list `str2` to track the sequence of cities and keeps removing
 * the processed paths from the main list `paths`.
 */

/**
 * Key Logic:-
 * -> The `str2` list is initialized with the first path, and the rest of the
 * paths are processed by checking if their cities exist in `str2`.
 * -> If a starting city is already in `str2`, the corresponding destination
 * city is added.
 * -> If a destination city is found in `str2`, the starting city is inserted
 * before it.
 */

/**
 * ******Time Complexity: O(n^2)*******
 * -> There are two nested loops. For each city path in `paths`, the program
 * iterates through all remaining paths to find a matching city.
 * -> This leads to a time complexity of O(n^2), where `n` is the number of city
 * pairs.
 * 
 * ******Space Complexity: O(n)******
 * -> The space complexity is O(n) because the program stores the city paths in
 * two lists (`paths` and `str2`), which together use linear space relative to
 * the number of city pairs.
 */
