package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Сортировка выбором. Дана последовательность чисел
a1  a2  an
.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */

public class Task03 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 8, 9, 34, 4, 5, 6, 7, 3, 1 };

		for (int i = 0; i < arr.length; i++) {
			int ind = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[ind]) {
					ind = j;
				}

			}
			swap(arr, ind, i);
		}

		System.out.println(Arrays.toString(arr));

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
