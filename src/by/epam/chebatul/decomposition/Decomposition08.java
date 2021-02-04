package by.epam.chebatul.decomposition;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */

public class Decomposition08 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Cумма с 1 по 3 - " + sumFromArray(1, 3, arr));
		System.out.println("Сумма с 3 по 5 - " + sumFromArray(3, 3, arr));
		System.out.println("Сумма с 4 по 6 - " + sumFromArray(4, 3, arr));

	}

	public static int sumFromArray(int init, int step, int[] array) {
		int sum = 0;
		for (int i = init - 1; i < init + step - 1; i++) {
			sum += array[i];
		}
		return sum;
	}

}
