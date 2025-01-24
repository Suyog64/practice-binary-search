package com.test;

public class PeakElement {

	// solution 1
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

	// solution 2
	public static int peakElementArray(int a[]) {
		int start = 0;
		int end = a.length - 1;
		int mid = start + (end - start) / 2;
		while (start < end) {
			if (a[mid] < a[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
			mid = start + (end - start) / 2;
		}
		return start;
	}

	public static void main(String[] args) {
		int a[] = { 30, 40, 20, 15 };
		System.out.println("Peak Element Present at Index:" + peakElement(a));
		System.out.println("=========================================");
		System.out.println("Peak Element Present at Index:" + peakElementArray(a));
	}

}
