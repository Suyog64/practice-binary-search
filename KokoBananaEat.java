package com.test;

public class KokoBananaEat {

	public static int kokoEat(int arr[], int k) {
		int start = 1;
		int end = maxOfArray(arr);
		int res = end;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (check(arr, mid, k) == true) {
				end = mid - 1;
				res = mid;
			} else {
				start = mid + 1;
			}
		}
		return res;
	}

	private static boolean check(int[] arr, int mid, int k) {
		int hours = 0;
		for (int i = 0; i < arr.length; i++) {
			hours += arr[i] / mid;
			if (arr[i] % mid != 0) {
				hours++;
			}
		}
		return hours <= k;
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
		int a[] = { 30, 11, 23, 4, 20 };
		int k = 5;
		System.out.println("Koko eat banana at speed :" + kokoEat(a, k));
	}

}
