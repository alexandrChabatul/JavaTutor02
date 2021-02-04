package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Даны две последовательности
a1  a2  an и b1  b2  bm
. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task02 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int[] arr2 = { 2, 3, 4, 5, 7, 10, 12 };

		int[] arr3 = new int[arr1.length + arr2.length];
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < arr3.length; i++) {
			if (count1 > arr1.length - 1) {
				arr3[i] = arr2[count2];
				count2++;
			} else if (count2 > arr2.length - 1) {
				arr3[i] = arr1[count1];
				count1++;
			} else if (arr1[count1] <= arr2[count2]) {
				arr3[i] = arr1[count1];
				count1++;
			} else if (arr1[count1] > arr2[count2]) {
				arr3[i] = arr2[count2];
				count2++;
			}
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		withoutNewArray(arr1, arr2);

	}

	public static void withoutNewArray(int[] arr1, int[] arr2) {

		int count2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (count2 > arr2.length - 1) {
				break;
			} else if (arr1[i] > arr2[count2]) {
				for (int j = arr1.length - 1; j > i; j--) {
					arr1[j] = arr1[j - 1];
				}
				arr1[i] = arr2[count2];
				count2++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
	}

}
