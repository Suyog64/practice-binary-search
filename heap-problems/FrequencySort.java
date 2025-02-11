package com.test.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

	public static int[] frequencySort(int[] nums) {
		// init hashmap and count occurences of elements in nums
		// init minHeap based on occurence, if two elements have same freq sort in
		// decreasing order
		// add elements in map into minHeap as array, containing element and occurence
		// init index to traverse array
		// loop while minHeap is not empty
		// grab min element
		// keep inserting element into nums while in bounds and occurence > 0
		// return nums

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			minHeap.add(new int[] { entry.getKey(), entry.getValue() });
		}

		int index = 0;

		while (!minHeap.isEmpty()) {
			int[] min = minHeap.poll();

			while (index < nums.length && min[1] > 0) {
				nums[index++] = min[0];
				min[1]--;
			}
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 3, 2, 2, 4 };
		int[] res = frequencySort(a);
		for (int i = res.length - 1; i >= 0; i--) {
			System.out.print(res[i] + " ");
		}

	}

}
