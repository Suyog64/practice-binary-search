package com.test;

public class AggressiveCows {

	public static int aggressiveCows(int[] arr, int k) {
		int res = 0;
		int start = 1;
		int end = arr[arr.length - 1] - arr[0];
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (check(arr, k, mid) == true) {
				res = mid;
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return res;
	}

	private static boolean check(int[] arr, int k, int mid) {
		int count = 1;
		int prev = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - prev >= mid) {
				prev = arr[i];
				count++;
			}
		}
		return (count >= k);
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7,  9, 11, 13, 15 };
		int k = 4;
		System.out.println("Minimum Distance:" + aggressiveCows(arr, k));

	}

}
