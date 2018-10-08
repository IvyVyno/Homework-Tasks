package HW4;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 1, 0, 3, 6, 2, 4, 7, 9, 8, 5 };
		sort(array);
		System.out.println(Arrays.toString(sort(array)));
	}

	private static int[] sort(int[] array) {
		if (array.length < 2) {
			return array;
		}
		int middle = array.length / 2;
		int[] firstPart = new int[middle];
		int[] secondPart = new int[array.length - middle];
		System.arraycopy(array, 0, firstPart, 0, firstPart.length);
		System.arraycopy(array, middle, secondPart, 0, secondPart.length);
		return merging(sort(firstPart), sort(secondPart));
	}

	private static int[] merging(int[] firstSeparated, int[] secondSeparated) {
		int sortedArrayLength = firstSeparated.length + secondSeparated.length;
		int[] sortedArray = new int[sortedArrayLength];
		int firstIndex = 0;
		int secondIndex = 0;
		for (int i = 0; i < sortedArrayLength; i++) {
			if (firstIndex == firstSeparated.length) {
				sortedArray[i] = secondSeparated[secondIndex++];
			} else if (secondIndex == secondSeparated.length) {
				sortedArray[i] = firstSeparated[firstIndex++];
			} else {
				if (firstSeparated[firstIndex] < secondSeparated[secondIndex]) {
					sortedArray[i] = firstSeparated[firstIndex++];
				} else {
					sortedArray[i] = secondSeparated[secondIndex++];
				}
			}
		}
		return sortedArray;
	}

}
