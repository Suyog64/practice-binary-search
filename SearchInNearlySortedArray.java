package com.test;

public class SearchInNearlySortedArray {

	// same as binary search, added step to check adjacent element of mid and
	// update start and end by 2
	public static int binarySearchInNearlySortedArray(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == ele) {
				return mid;
			} else if (a[mid - 1] == ele) {
				return mid - 1;
			} else if (a[mid + 1] == ele) {
				return mid + 1;
			}
			if (a[mid] <= ele) {
				start = mid + 2;
			} else {
				end = mid - 2;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// [2,5,10,30,20,40], find index of 20; return 4
		int a[] = { 2, 5, 10, 30, 20, 40 };
		int ele = 20;
		System.out.println("Element present at index:" + binarySearchInNearlySortedArray(a, ele));
	}

}
