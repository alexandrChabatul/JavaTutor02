package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Сортировка обменами. Дана последовательность чисел
a1  a2  an
.Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа
i i+1 a и a
. Если
ai  ai+1
, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task04 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 8, 9, 34, 4, 5, 6, 7, 3, 1 };

		int counter = 0;
		boolean needSwap = true;

		while (needSwap) {
			needSwap = false;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					swap(arr, i, i - 1);
					counter++;
					needSwap = true;
				}
			}

		}

		System.out.println(Arrays.toString(arr));
		System.out.println("Перестановок - " + counter);

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
