//Leetcode Question : 605 : Can Place Flowers
//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

public class Can_Place_Flowers {
    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 1, 0, 1 }; // Ypu can give multiple inputs here
        int n = 1;
        if (n == 0) {
            System.out.println(true);
            System.exit(0);
        }
        if (flowerbed.length == 0) {
            System.out.println(false);
            System.exit(0);
        }

        // Edge case: check the first position
        if ((flowerbed[0] == 0 && flowerbed.length == 1) || (flowerbed[0] == 0 && flowerbed[1] == 0)) {
            flowerbed[0] = 1;
            n--;
            if (n == 0) {
                System.out.println(true);
                System.exit(0);
            }
        }
        // Check the middle of the flowerbed
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                i++; // Skip the next spot to avoid adjacent planting
                if (n == 0) {
                    System.out.println(true);
                    System.exit(0);
                }
            }
        }
        // Edge case: check the last position
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
            if (n == 0) {
                System.out.println(true);
                System.exit(0);
            }
        }
        System.out.println(false);
    }
}

// Time complexity = O(n)
// Space complexity = O(1)

/*
 * Code Summary:-
 * -> The program checks if `n` new flowers can be planted in the flowerbed
 * without violating the no-adjacent-flowers rule.
 * -> If `n` is 0, it immediately returns `true` (no need to plant any flowers).
 * -> If the flowerbed is empty, it returns `false` (no place to plant flowers).
 * -> It handles the edge case for the first position by checking the first two
 * spots. If the first spot is valid, it plants a flower and decrements `n`.
 * -> The main loop runs through the middle of the flowerbed, checking if three
 * consecutive spots are empty. If so, it plants a flower, decrements `n`, and
 * skips the next spot.
 * -> It handles the edge case for the last position similarly to the first.
 * -> If enough flowers are planted (`n` reaches 0), it returns `true`,
 * otherwise `false`.
 */

/*
 * Key Logic:-
 * -> The code checks for empty spots in the flowerbed that allow planting a
 * flower without adjacent flowers.
 * -> It uses two edge cases for the first and last spots and skips ahead after
 * planting to avoid adjacent placements.
 * -> The condition is met if `n` flowers are successfully planted, returning
 * `true`.
 */