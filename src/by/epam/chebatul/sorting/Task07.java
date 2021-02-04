package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Пусть даны две неубывающие последовательности действительных чисел
a1  a2  an и b1  b2  bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности
b1  b2  bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task07 {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 5, 6, 9 };
		int[] b = { 2, 4, 7, 8 };

		int[] tempArr = sumArray(a, b);
		System.out.println(Arrays.toString(tempArr));

		for (int i = 0; i < b.length; i++) {
			System.out.println("Число " + b[i] + " ставим на позицию "  + positionSearch(tempArr, b[i]) + ".");
		}
	}

	public static int[] sumArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < c.length; i++) {
			if (i < a.length) {
				c[i] = a[i];

			} else {
				c[i] = b[i - a.length];
			}
		}
		Arrays.sort(c);
		return c;
	}

	public static int positionSearch(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i + 1;
			}
		}
		return num;
	}
}
