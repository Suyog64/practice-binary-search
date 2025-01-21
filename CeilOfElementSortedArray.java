package com.test;

public class CeilOfElementSortedArray {

	public static int floorElement(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] >= ele) { // compare whether element is greater 
				res = a[mid]; // if yes possible ceil
				end = mid - 1; // check in left side of element for further elements
			} else if (a[mid] < ele) {
				start = mid + 1; // check in right side of array
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,8,10,10,12,15,19};
		int ele = 5;
		System.out.println("Ceil element of "+  ele + " is "+ floorElement(a, ele));
	}

}
