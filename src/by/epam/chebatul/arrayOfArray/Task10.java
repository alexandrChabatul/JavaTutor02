package by.epam.chebatul.arrayOfArray;

import java.util.Random;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		arrayInit(arr);
		arrayPrint(arr);
		System.out.println("\nResult:");
		taskLogics(arr);

	}

	public static void arrayInit(int[][] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10) - 5;
			}
		}

	}

	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void taskLogics(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i][i] > 0) {
				System.out.print(array[i][i] + "\t");
			}
		}
	}

}
