package com.test;

public class MinDiffEleSortedArray {

	public static int minDiffElement(int a[], int key) {

		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key == a[mid]) {
				return a[mid];
			}
			if (key < a[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		int highDiff = Math.abs(key - a[end]);
		int lowDiff = Math.abs(key - a[start]);
		if (highDiff < lowDiff) {
			return a[end];
		} else {
			return a[start];
		}
	}

	// another way find floor and ceil
	// find difference between them
	public static int floorElement(int a[], int key) {
		int start = 0;
		int end = a.length;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key == a[mid]) {
				res = a[mid];
				start = mid + 1;
			}
			if (key > a[mid]) {
				res = a[mid];
				start = mid + 1;
			} else if (key < a[mid]) {
				end = mid - 1;
			}
		}
		return res;
	}

	public static int ceilElement(int a[], int key) {
		int start = 0;
		int end = a.length;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key == a[mid]) {
				res = a[mid];
				end = mid - 1;
			}
			if (key < a[mid]) {
				res = a[mid];
				end = mid - 1;
			} else if (key > a[mid]) {
				start = mid + 1;
			}
		}
		return res;
	}

	public static int minDiiferenceElement(int a[], int key) {
		int floor = floorElement(a, key);
		int ceil = ceilElement(a, key);
		int highDiff = Math.abs(key - ceil);
		int lowDiff = Math.abs(key - floor);
		if (highDiff < lowDiff) {
			return ceil;
		} else {
			return floor;
		}
	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 8, 10, 15 };
		int ele = 12;
		System.out.println("Min Diff element in array :" + minDiffElement(a, ele));
		System.out.println("============================================");
		System.out.println("Min Diff element in array :" + minDiiferenceElement(a, ele));
	}

}
