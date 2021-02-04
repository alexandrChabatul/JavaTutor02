package by.epam.chebatul.arrayOfArray;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Task15 {

	public static void main(String[] args) {

		int[][] arr = { { 4, 2, 6 }, { 8, 4, 5 }, { 2, 1, 6 }, { 7, 2, 3 } };

		arrayPrint(arr);
		int max = findMax(arr);
		swapOddNum(arr, max);
		System.out.println();
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

	public static int findMax(int[][] array) {

		int max = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				max = Math.max(max, array[i][j]);
			}
		}
		return max;
	}

	public static void swapOddNum(int[][] array, int max) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] = max;
				}
			}
		}

	}

}
