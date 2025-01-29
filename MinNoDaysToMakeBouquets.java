package com.test;

public class MinNoDaysToMakeBouquets {
	
	// problem : https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/submissions/1524549274/
	public static boolean check(int[] bloomDay, int m, int k, int mid) {
		int n = bloomDay.length;
		int bouquets = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (bloomDay[i] <= mid) {
				count++;
			} else {
				bouquets += count / k;
				count = 0;
			}
		}
		bouquets += count / k;
		return bouquets >= m;
	}

	private static int maxOfArray(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}

	private static int minOfArray(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}

	public static int minDays(int[] bloomDay, int m, int k) {

		if (((long) m * k) > bloomDay.length)
			return -1;

		int start = minOfArray(bloomDay);
		int end = maxOfArray(bloomDay);
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (check(bloomDay, m, k, mid)) {
				res = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 7,7,7,7,12,7,7 };
		int m = 2;
		int k = 3;
		System.out.println(minDays(a, m, k));
	}

}
