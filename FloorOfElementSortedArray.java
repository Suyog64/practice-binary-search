package com.test;

public class FloorOfElementSortedArray {

	public static int floorElement(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] <= ele) { // compare whether element is smaller 
				res = a[mid]; // if yes possible floor
				start = mid + 1; // check in right side of element for further elements
			} else if (a[mid] > ele) {
				end = mid - 1; // check in left side of array
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,10,10,12,15,19};
		int ele = 4;
		System.out.println("Floor element of "+  ele + " is "+ floorElement(a, ele));
	}

}
