package com.test;

public class NoOfTimesArrayRotated {

	public static int arrayRotated(int a[]) {

		int n = a.length;
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			int prev = (mid - 1 + n) % n;
			int next = (mid + 1) % n;
			if (a[mid] <= a[prev] && a[mid] <= a[next]) {
				return mid;
			}
			if (a[0] <= a[mid]) {
				start = mid + 1;
			} else if (a[mid] <= a[n-1]) {
				end = mid - 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[] = { 11, 15, 16, 18, 2, 5, 6, 8};
		System.out.println("Array Rotated:" + arrayRotated(a));
	}

}
