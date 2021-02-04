package by.epam.chebatul.arrayOfArray;

import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка N по правилу:
 A(i,j) = sin ((i2-j2)/n)
 */

public class Task07 {

	public static void main(String[] args) {

		int n;
		n = enterFromConsole("Введите размер (n) >> ");

		double[][] arr = new double[n][n];

		arrayInit(arr);
		arrayPrint(arr);
		System.out.println("Положительных элементов " + positiveCount(arr));

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

	public static void arrayInit(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin((i * i + j * j) / array.length);
			}
		}

	}

	public static void arrayPrint(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int positiveCount(double[][] array) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > 0) {
					counter++;
				}
			}
		}
		return counter;
	}

}