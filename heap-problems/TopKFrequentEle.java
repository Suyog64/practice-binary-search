package com.test.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentEle {

	public static void topKFrequent(int[] arr, int k) {

		int[] res = new int[k];

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		for (int val : map.keySet()) {
			minHeap.add(val);
		}
		for (int i = 0; i < k; i++) {
			res[i] = minHeap.poll();
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 3, 2, 2, 4 };
		int k = 3;
		topKFrequent(arr, k);
	}

}
