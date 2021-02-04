package by.epam.chebatul.arrayOfArray;

import java.util.Arrays;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */

public class Task09 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 } };

		int[] sum = columnSum(arr);

		arrayPrint(arr);

		System.out.println(Arrays.toString(sum));

		maxColumnPrint(sum);

	}

	public static int[] columnSum(int[][] array) {

		int[] sum = new int[array[0].length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum[j] += array[i][j];
			}
		}

		return sum;
	}

	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void maxColumnPrint(int[] array) {

		int max = array[0];
		int columnNum = 0;

		for (int i = 0; i < array.length; i++) {
			max = Math.max(max, array[i]);
			if (max == array[i]) {
				columnNum = i;
			}

		}
		System.out.println("Столбец номер " + (columnNum + 1) + " с максимальной суммой.");

	}

}
