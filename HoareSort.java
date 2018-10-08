package HW4;

import java.util.Arrays;

public class HoareSort {

	public static void main(String[] args) {
		int[] array = { 0, 6, 1, 10, 4, 8, 3, 5, 7, 9, 2 };
		int firstElement = 0;
		int lastElement = array.length - 1;
		hoareSort(array, firstElement, lastElement);
		System.out.println(Arrays.toString(array));
	}

	private static void hoareSort(int[] array, int firstElement, int lastElement) {
		int first = firstElement;
		int last = lastElement;
		int mid = array[(first + last) / 2];

		while (first < last) {
			while (array[first] < mid) {
				first++;
			}
			while (mid < array[last]) {
				last--;
			}
			if (first <= last) {
				int temp = array[first];
				array[first] = array[last];
				array[last] = temp;
				first++;
				last--;
			}
		}
		if (firstElement < last) {
			hoareSort(array, firstElement, last);
		}
		if (first < lastElement) {
			hoareSort(array, first, lastElement);
		}
	}

}
