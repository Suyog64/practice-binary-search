package com.test;

public class CountElementSortedArray {

	public static int firstOccurence(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == ele) {
				res = mid;
				end = mid - 1;
			}
			if (ele < a[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return res;
	}
	
	public static int lastOccurence(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == ele) {
				res = mid;
				start = mid + 1;
			}
			if (ele < a[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return res;
	}
	
	public static int countElement(int a[], int ele) {
		if(a.length==1 && a[0]==ele) {
			return 1;
		}
		return lastOccurence(a, ele) - firstOccurence(a, ele) + 1;
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 10, 10, 10, 12, 28 };
		int ele = 10;
		System.out.println("Count of Element : " + countElement(a, ele));
	}

}
