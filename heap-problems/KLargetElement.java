package com.test.heap;

import java.util.PriorityQueue;

public class KLargetElement {

	public static int kLargestElement(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			if (pq.size() > k) {
				pq.remove();
			}
		}
		return pq.element();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 10, 4, 3, 15, 20 };
		int k = 3;
		System.out.println(kLargestElement(a, k));

	}

}
