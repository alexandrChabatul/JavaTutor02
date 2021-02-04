package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив
 */

public class Task01 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1, 1 };
		int[] arr2 = { 9, 9, 9, 10, 12 };
		int k = 3;

		int[] arr3 = new int[arr1.length + arr2.length];
		int count = 0;

		for (int i = 0; i < arr3.length; i++) {
			if (i < k) {
				arr3[i] = arr1[i];
			} else if (i >= k && i < k + arr2.length) {
				arr3[i] = arr2[count];
				count++;
			} else {
				arr3[i] = arr1[i - arr2.length];
			}
		}

		System.out.println(Arrays.toString(arr3));

		withoutNewArray(arr1, arr2, k);
		System.out.println(Arrays.toString(arr1));

	}

	public static void withoutNewArray(int[] arr1, int[] arr2, int k) {

		if (k < arr1.length) {
			for (int i = k; i < arr1.length; i++) {
				if (i < k + arr2.length) {
					for (int j = arr1.length - 1; j > i; j--) {
						arr1[j] = arr1[j - 1];
					}
					arr1[i] = arr2[i - k];
				}
			}
		}

	}

}
