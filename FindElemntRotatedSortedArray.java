package com.test;

public class FindElemntRotatedSortedArray {

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
			} else if (a[mid] <= a[n - 1]) {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearch(int a[], int ele, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == ele) {
				return mid;
			}
			if (a[mid] <= ele) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static int findElement(int a[], int ele) {
		int rotatedIndex = arrayRotated(a);
		// binary search
		int search1 = binarySearch(a, ele, 0, rotatedIndex - 1);
		int search2 = binarySearch(a, ele, rotatedIndex, a.length - 1);
		if (search1 != -1) {
			return search1;
		} else if (search2 != -1) {
			return search2;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 11, 15, 16, 18, 2, 5, 6, 8 };
		int ele = 8;
		System.out.println("Array Rotated:" + findElement(a, ele));
	}

}
