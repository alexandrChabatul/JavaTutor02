package by.epam.chebatul.arrayOfArray;

import java.util.Arrays;

/*
 Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {

	public static void main(String[] args) {

		int[][] arr = { { 4, 2, 6 }, { 8, 4, 5 }, { 2, 1, 6 }, { 7, 2, 3 } };

		arrayPrint(arr);

		System.out.println("\nПо возрастанию:");
		int[][] arr1 = Arrays.copyOf(arr, arr.length);
		arraySortToMax(arr1);
		arrayPrint(arr1);

		System.out.println("\nПо убыванию:");
		int[][] arr2 = Arrays.copyOf(arr, arr.length);
		arraySortToMin(arr2);
		arrayPrint(arr2);

	}

	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void arraySortToMax(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array.length - 1; k++) {
					if (array[k][j] > array[k + 1][j]) {
						int temp = array[k][j];
						array[k][j] = array[k + 1][j];
						array[k + 1][j] = temp;
					}
				}
			}
		}

	}

	public static void arraySortToMin(int[][] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array.length - 1; k++) {
					if (array[k][j] < array[k + 1][j]) {
						int temp = array[k][j];
						array[k][j] = array[k + 1][j];
						array[k + 1][j] = temp;
					}
				}
			}
		}
	}

}
