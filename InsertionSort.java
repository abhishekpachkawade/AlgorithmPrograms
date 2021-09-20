
package com.algorithmprogeam;

/**
 * Purpose : Reads in strings and prints them in sorted order using insertion
 * sort.
 * 
 * 
 * @author Abhishek
 *
 */
public class InsertionSort {

	//// Static method for insertion sort
	public static String[] stringInsertionSort(String[] array, int n) {
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	// Static method for printing String array
	public static void printStringArr(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Insertion Sort");
		String[] arr = { "Q", "M", "K", "B", "A", "E", "O", "C", "N", "D" };
		System.out.println("Before sorting");
		printStringArr(arr);
		String[] sortedArray = stringInsertionSort(arr, arr.length);
		System.out.println("After sorting");
		printStringArr(sortedArray);
	}
}
