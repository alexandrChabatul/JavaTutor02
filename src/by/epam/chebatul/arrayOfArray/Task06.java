package by.epam.chebatul.arrayOfArray;

import java.util.Scanner;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task06 {

	public static void main(String[] args) {

		int n;
		n = enterFromConsole("Введите размерность матрицы (n) >> ");

		int[][] arr = new int[n][n];

		arrayInit(arr);
		arrayPrint(arr);

	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();

		return value;
	}

	public static void arrayInit(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			if (i<array.length/2) {
				for (int j = 0 + i; j < array[i].length - i; j++) {
					array[i][j] = 1;
				}
			} else {
				for (int j = array.length - i-1; j < 1+i; j++) {
					array[i][j] = 1;
				}
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

}