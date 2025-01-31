package com.test;

public class SmallestDivisor {

	public static int smallestDivisor(int[] nums, int threshold) {
        int l = 1, r = 1000000;
        while (l < r) {
            int mid = (l + r) >> 1;
            int s = 0;
            for (int x : nums) {
                s += (x + mid - 1) / mid;
            }
            if (s <= threshold) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

	public static void main(String[] args) {
		int[] arr = { 44, 22, 33, 11, 1 };
		int k = 5;
		System.out.println(smallestDivisor(arr, k));
	}

}
