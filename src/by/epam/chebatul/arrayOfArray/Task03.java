package by.epam.chebatul.arrayOfArray;

import java.util.Scanner;

/*
 Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */

public class Task03 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int lineValue = enterFromConsole("Введите строку: ");
		linePrint(arr, lineValue);
		
		System.out.println();
		int columnValue = enterFromConsole("Введите столбец: ");
		columnPrint(arr, columnValue);

	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int value;
		
		System.out.print(message);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		
		return value;

	}

	public static void linePrint(int[][] array, int value) {

		for (int i = value - 1; i < value; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}

		}
	}

	public static void columnPrint(int[][] array, int value) {

		for (int i = 0; i < array.length; i++) {
			for (int j = value - 1; j < value; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();

		}
	}

}
