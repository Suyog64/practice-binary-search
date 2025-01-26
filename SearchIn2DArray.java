package com.test;

public class SearchIn2DArray {

	public static int[] search(int arr[][], int n, int m, int key) {
		int i = 0, j = m - 1;
		int ans[] = { -1, -1 };
		while (i < n && j > -1) {
			if (arr[i][j] == key) {
				ans[0] = i;
				ans[1] = j;
				return ans;
			} else if (arr[i][j] > key) {
				j--;
			} else if (arr[i][j] < key) {
				i++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 47 }, { 32, 33, 39, 50 } };
		int key = 29;
		int ans[] = search(arr, 4, 4, key);
		System.out.println("Element prsent at index 2D");
		for(int i=0;i<2;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
