package by.epam.chebatul.arrayOfArray;

import java.util.Scanner;

/*
 В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class Task08 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 } };

		arrayPrint(arr);
		int swap1 = enterFromConsole("Какой столбец будем менять?", arr) - 1;
		int swap2 = enterFromConsole("На какой столбец будем менять?", arr) - 1;
		swap(swap1, swap2, arr);
		arrayPrint(arr);

	}

	public static int enterFromConsole(String message, int[][] array) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num = 0;

		System.out.print(message);
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				if (num > 0 && num <= array[0].length) {
					break;
				} else {
					System.out.println("Ошибка.");
					System.out.print(message);
				}
			} else {
				System.out.println("Ошибка.");
				System.out.print(message);
				sc.next();
			}
		}
		return num;
	}

	public static void swap(int s1, int s2, int[][] array) {

		int temp;

		for (int i = 0; i < array.length; i++) {
			temp = array[i][s1];
			array[i][s1] = array[i][s2];
			array[i][s2] = temp;

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