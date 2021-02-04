package by.epam.chebatul.arrayOfArray;

import java.util.Random;

/*
  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task02 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		arrayInit(arr);
		arrayPrint(arr);
		System.out.println("\nResult: \n");
		taskLogics(arr);

	}

	public static void arrayInit(int[][] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(10);
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
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					System.out.print(array[i][j] + "\t");
				}
			}
		}
	}

}