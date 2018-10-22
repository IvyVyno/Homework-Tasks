package HW8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		arrayFill(array);
		binarySearch(array, 10, 0, array.length - 1);
	}

	private static int binarySearch(int[] array, int key, int fromIndex, int toIndex) {
		int low = fromIndex;
		int high = toIndex;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] > key) {
				high = mid - 1;
			} else if (array[mid] < key) {
				low = mid + 1;
			} else {
				System.out.println("Index of found element is: " + mid);
				System.out.println("Element is: " + array[mid]);
				return mid;
			}
		}
		System.out.println("Key not found");
		return 0;
	}

	private static void arrayFill(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

}
