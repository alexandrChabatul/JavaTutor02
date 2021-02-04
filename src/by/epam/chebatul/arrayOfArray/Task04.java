package by.epam.chebatul.arrayOfArray;

import java.util.Scanner;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task04 {

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
			for (int j = 0; j < array[i].length; j++) {
				if (i%2==0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = array.length-j;
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
