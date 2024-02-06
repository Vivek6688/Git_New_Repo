package com.tutorials.RestApi.Entity;

public class MoveZerosToLeft {
	public static void main(String[] args) {
		int[] a = { 0, 5, 7, 0, 6, 9, 0, 1, 2 };

		moveZerosToLeft(a);

		// Print the modified array
		for (int num : a) {
			System.out.print(num + " ");
		}
	}

	private static void moveZerosToLeft(int[] arr) {
		int nonZeroIndex = 0;

		// Iterate through the array
		for (int i = 0; i < arr.length; i++) {
			// If the current element is non-zero, swap it with the element at the
			// nonZeroIndex
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZeroIndex];
				arr[nonZeroIndex] = temp;
				nonZeroIndex++;
			}
		}
	}
}
