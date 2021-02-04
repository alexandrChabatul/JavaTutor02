package by.epam.chebatul.arrayOfArray;

import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,
2
n
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
6 1 8 
7 5 3
2 9 4
 */

public class Task16 {

	public static void main(String[] args) {

		int n;
		n = enterFromConsole("Введите порядок >>");

		if (n % 2 != 0) {
			System.out.println("Магический квадрат порядка " + n);
			oddMatrix(n);

		} else if (n % 4 == 0) {
			System.out.println("Магический квадрат порядка " + n);
			evenMatrix(n);
		} else {
			System.out.println("Нельзя построить такой квадрат.");
		}

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

	public static void arrayPrint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void standartInit(int[][] array) {
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = counter;
				counter++;

			}
		}

	}

	public static void reversetInit(int[][] array) {
		int counter = 1;
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = array[0].length - 1; j >= 0; j--) {
				array[i][j] = counter;
				counter++;

			}
		}

	}

	public static void oddMatrix(int n) {
		int[][] matrix = new int[n][n];

		int counter = 1;
		int i = 0;
		int j = n / 2;

		while (counter <= n * n) {
			if (matrix[i][j] == 0) {
				matrix[i][j] = counter;
				counter++;
				i -= 1;
				j += 1;

				if (i < 0 && j > n - 1) {
					i += 2;
					j--;
				} else if (i < 0) {
					i += n;
				} else if (j > n - 1) {
					j -= n;
				}
			} else {
				i += 2;
				j--;
			}

		}
		arrayPrint(matrix);

	}

	public static void evenMatrix(int n) {

		int[][] matrix = new int[n][n];

		int[][] matrix1 = new int[n][n];

		standartInit(matrix);
		reversetInit(matrix1);

		for (int i = 0; i < n; i += 4) {
			for (int j = 0; j < n; j += 4) {
				for (int x = 0; x < 4; x++) {
					for (int y = 0; y < 4; y++) {
						if (x == y || x == 3 - y) {
							matrix[i + x][j + y] = matrix1[i + x][j + y];

						}
					}
				}

			}
		}
		arrayPrint(matrix);

	}
}
