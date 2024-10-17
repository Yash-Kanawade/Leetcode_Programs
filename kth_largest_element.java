//Leetcode Question:215. Kth Largest Element in an Array

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kth_largest_element {
    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums)
            pq.add(i);
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}

/**
 * Code Summary:
 * -> This program finds the Kth largest element in an array using a max-heap
 * (priority queue).
 * -> The priority queue stores elements in descending order, allowing us to
 * efficiently retrieve the Kth largest element.
 * -> After adding all elements to the queue, the largest k-1 elements are
 * polled (removed) so that the Kth largest element remains at the top of the
 * heap.
 * -> The final result is obtained by peeking at the top of the priority queue.
 *
 * Key Logic:
 * -> The use of a max-heap allows for easy retrieval of the largest elements in
 * O(log n) time for each insertion and removal operation.
 * -> After inserting all elements, we remove the top k-1 elements, leaving the
 * Kth largest element at the top of the heap.
 *
 * Time Complexity: O(n log n)
 * -> Adding each element to the max-heap takes O(log n) time, and since we do
 * this for n elements, the total time for adding elements is O(n log n).
 * -> Polling the K-1 largest elements takes O(k log n) time.
 * -> Therefore, the overall time complexity is O(n log n).
 *
 * Space Complexity: O(n)
 * -> The space complexity is O(n) because the priority queue stores all
 * elements of the array.
 */