package com.algorithmprogeam;

/**
 * 
 * Purpose : Reads in integers prints them in sorted order using Bubble Sort
 * 
 * @author Abhishek
 *
 */
public class BubbleSort {

	// static method for Bubble sort
	private static void intBubbleSort(int[] array) {
		int temp;
		boolean swapped;
		for (int i = 0; i < array.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// swap array[j] and array[j+1]
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}

			// if no two element were
			// swapped by inner loop then break
			if (swapped == false) {
				break;
			}
		}

	}

	// method to print an array
	private static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// int array
		int[] array = { 2, 1, 54, 3, 85, 45, 25 };
		System.out.println("Before Sorting");
		printIntArray(array);
		intBubbleSort(array);
		System.out.println("After sorting");
		printIntArray(array);

	}
}
