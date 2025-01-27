package com.test;

public class AllocateMinNoOfPages {

	// problem link : https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
	public static int minNoOfPages(int arr[], int k) {
		int n = arr.length;
		if (n < k) {
			return -1;
		}
		int start = maxOfArray(arr);
		int end = sumOfArray(arr);
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (isValid(arr, n, k, mid) == true) {
				res = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return res;
	}

	private static boolean isValid(int[] arr, int n, int k, int max) {
		int student = 1;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if (sum > max) {
				student++;
				sum = arr[i];
			}
			if (student > k) {
				return false;
			}
		}
		return true;
	}

	private static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	private static int maxOfArray(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int k = 2;
		System.out.println("Minimum no of pages student to allocate:" + minNoOfPages(a, k));
	}

}
