package by.epam.chebatul.arrayOfArray;

import java.util.Random;

/*
 Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

public class Task11 {

	public static void main(String[] args) {
		int[][] arr = new int[10][20];

		arrayInit(arr);
		arrayPrint(arr);
		System.out.println("\nResult:");
		taskLogics(arr);

	}

	public static void arrayInit(int[][] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(15);
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
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 5) {
					counter++;
				}
			}
			if (counter >= 3) {
				System.out.print(i + "\t");
			}
			counter = 0;

		}
	}

}
