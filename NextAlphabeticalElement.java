package com.test;

public class NextAlphabeticalElement {

	public static char nextAlphabeticalElement(char a[], char ele) {
		char res = '#';
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (a[mid] == ele) {
				start = mid + 1;
			} else if (a[mid] < ele) {
				start = mid + 1;
			} else if (a[mid] > ele) {
				res = a[mid];
				end = mid - 1;
			}
		}
		if (res == '#') {
			return a[a.length - 1];
		}
		return res;
	}

	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'f', 'h' };
		char ele = 'h';
		System.out.println("Next element of " + ele + " is " + nextAlphabeticalElement(a, ele));
	}

}
