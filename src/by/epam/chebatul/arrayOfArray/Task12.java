package by.epam.chebatul.arrayOfArray;

import java.util.Arrays;

/*
 Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 5, 2, 3 }, { 2, 1, 1, 5 }, { 4, 7, 6, 2 } };

		arrayPrint(arr);

		System.out.println("\nПо возрастанию:");
		int[][] arr1 = Arrays.copyOf(arr, arr.length);
		arraySortToMax(arr1);
		arrayPrint(arr1);

		System.out.println("\nПо убыванию:");
		int[][] arr2 = Arrays.copyOf(arr, arr.length);
		arraySortToMin1(arr2);
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
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
		}

	}

	public static void arraySortToMin1(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array[i]);
			int min = 0;
			int max = array[i].length - 1;
			while (min < max) {
				int temp = array[i][min];
				array[i][min] = array[i][max];
				array[i][max] = temp;
				min++;
				max--;
			}
		}
	}

}
