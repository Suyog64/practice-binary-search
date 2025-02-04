package com.test.heap;

import java.util.PriorityQueue;

public class SortKSortedArray {

	public static void sort(int[] arr, int k) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			minHeap.add(arr[i]);
			if (minHeap.size() > k) {
				arr[j] = minHeap.element();
				minHeap.remove();
				j++;
			}
		}
		while (minHeap.size() > 0) {
			arr[j] = minHeap.element();
			j++;
			minHeap.remove();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	public static void main(String[] args) {
		int a[] = { 7, 10, 4, 3, 15, 20 };
		int k = 3;
		sort(a, k);

	}

}
