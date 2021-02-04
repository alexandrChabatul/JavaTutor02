package by.epam.chebatul.arrayOfArray;

import java.util.Random;

/*
 Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

public class Task14 {

	public static void main(String[] args) {

		int m = 5;
		int n = 4;
		int[][] arr = new int[m][n];

		arrayInit(arr);
		arrayPrint(arr);

	}

	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void arrayInit(int[][] array) {

		Random rand = new Random();
		int[] temp = new int[array[0].length];

		for (int j = 0; j < array[0].length; j++) {
			while (temp[j] < j + 1) {
				for (int i = 0; i < array.length; i++) {
					if (array[i][j] == 0) {
						boolean coin = rand.nextBoolean();
						if (coin == true) {
							array[i][j] = 1;
							temp[j] += 1;
						}
						if (temp[j] > j + 1) {
							array[i][j] = 0;
						}
					}
				}

			}

		}

	}

}