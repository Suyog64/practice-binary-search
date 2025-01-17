package com.test;

public class OrderAgnosticSearch {

	public static int ascBinarySearch(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		
		while(start<=end) {
			int mid = start + ( end - start ) / 2;
			if( a[mid]==ele ) {
				return mid;
			}
			if( ele<a[mid] ) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		return -1;
	}
	
	public static int dscBinarySearch(int a[], int ele) {
		int start = 0;
		int end = a.length - 1;
		
		while(start<=end) {
			int mid = start + ( end - start ) / 2;
			if( a[mid]==ele ) {
				return mid;
			}
			if( ele<a[mid] ) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		
		return -1;
	}
	
	public static int agnosticSearch(int a[], int ele) {
		
		if(a.length == 1) {
			return a[0];
		}
		if(a[0]>a[1]) {
			return dscBinarySearch(a, ele);
		} else {
			return ascBinarySearch(a, ele);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {9,8,5,4,3,1};
		int ele = 3;
		System.out.println("Element found at index:"+ agnosticSearch(a, ele));

	}

}
