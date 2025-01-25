package com.test;

public class SearchElementBitonicArray {

	public static int peakElement(int a[]) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid > 0 && mid < a.length - 1) {
				if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
					return mid;
				} else if (a[mid + 1] > a[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} else if (mid == 0) {
				if (a[0] > a[1]) {
					return 0;
				} else {
					return 1;
				}
			} else if (mid == a.length - 1) {
				if (a[a.length - 1] > a[a.length - 2]) {
					return a.length - 1;
				} else {
					return a.length - 2;
				}
			}
		}
		return -1;
	}

	public static int ascendingBinarySearch(int a[], int start, int end, int key) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == key) {
				return mid;
			}
			if (a[mid] < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return -1;
	}

	public static int descendingBinarySearch(int a[], int start, int end, int key) {

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == key) {
				return mid;
			}
			if (a[mid] < key) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 8, 12, 4, 2 };
		int key = 4;
		int peak = peakElement(a);
		int ind1 = ascendingBinarySearch(a, 0, peak - 1, key);
		int ind2 = descendingBinarySearch(a, peak, a.length - 1, key);
		int maxEleIndex = Math.max(ind1, ind2);
		System.out.println("Element Present at " + maxEleIndex);

	}

}
