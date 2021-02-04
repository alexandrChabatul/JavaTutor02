package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента
ai и ai+1. Если ai  ai+1, то продвигаются на один элемент вперед. Если
ai  ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */

public class Task06 {

	public static void main(String[] args) {

		int[] arr = { 35, 1, 2, 3, 4, 7, 8, 9, 34, 4, 5, 6, 7, 3, 1 };
		System.out.println(Arrays.toString(arr));
		shellSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void shellSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (i == 0) {
				i++;
			}
			if (arr[i - 1] > arr[i]) {
				swap(arr, i, i - 1);
				i -= 2;
			}
		}
	}

}
