//Leetcode Question:2073. Time Needed to Buy Tickets

import java.util.LinkedList;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets {
    public static void main(String[] args) {
        int[] tickets = { 2, 3, 2 };
        int k = 2;
        int sec = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    sec++;
                    if (tickets[k] == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println(sec);
    }
}

/**
 * Code Summary:
 * -> This program calculates the time needed for a specific person in a line to
 * buy all their tickets. Each person buys one ticket per turn in sequence.
 * -> The time increments each time a person buys a ticket. The loop continues
 * until the target person has bought all their tickets.
 *
 * Key Logic:
 * -> The loop iterates over each person’s ticket requirement, decrementing it
 * by one if they still need tickets, and counting the time taken until the
 * specified person’s tickets reach zero.
 *
 * Time Complexity: O(n * t)
 * -> The time complexity is O(n * t), where n is the number of people and t is
 * the average number of tickets each person buys.
 *
 * Space Complexity: O(1)
 * -> The space complexity is O(1), as only a fixed amount of extra space is
 * used regardless of input size.
 */