//Leetcode Question : 1700. Number of Students Unable to Eat Lunch

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public static void main(String[] args) {
        int[] students = { 1, 1, 1, 0, 0, 1 };
        int[] sandwiches = { 1, 0, 0, 0, 1, 1 };
        int i = 0;

        int roatation = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.offer(student);
        }

        while (!queue.isEmpty() && roatation < queue.size()) {
            if (queue.peek() == sandwiches[i]) {
                i++;
                queue.poll();
                roatation = 0;
            } else {
                queue.offer(queue.poll());
                roatation++;
            }
        }
        System.out.println(queue.size());
    }
}

/**
 * Code Summary:
 * -> This program simulates a queue of students trying to eat sandwiches. If a
 * student at the front of the queue cannot eat the current sandwich, they move
 * to the back of the queue.
 * -> The process continues until all students are served or no more sandwiches
 * can be eaten by the remaining students.
 *
 * Key Logic:
 * -> A queue is used to track the students' sandwich preferences. Students
 * rotate through the queue until the first student in line can eat the current
 * sandwich or the rotation limit is hit.
 *
 * Time Complexity: O(n)
 * -> The time complexity is O(n), where n is the number of students. Each
 * student is processed once, and the while loop runs a maximum of n iterations.
 *
 * Space Complexity: O(n)
 * -> The space complexity is O(n) for the queue, which stores the student
 * preferences.
 */