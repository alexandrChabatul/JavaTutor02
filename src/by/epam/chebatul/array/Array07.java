package by.epam.chebatul.array;

import java.util.Arrays;

/*
 Даны действительные числа a a an , , , Найти
max(a1 + a2n,  a2 + a2n−1 ... an + an+1)
 */

public class Array07 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 10, 6, 7, 8, 9, 10, 11, 12, 13 };

		int temp;
		if (arrayA.length % 2 == 0) {
			temp = arrayA.length / 2;
		} else {
			temp = arrayA.length / 2 + 1;
		}

		int[] arrayTemp = new int[temp];

		for (int i = 0; i < arrayTemp.length; i++) {
			if (i < arrayTemp.length - 1) {
				arrayTemp[i] = arrayA[i] + arrayA[arrayA.length - 1 - i];
			} else {
				arrayTemp[i] = arrayA[i] + arrayA[i + 1];
			}

		}
		System.out.println(Arrays.toString(arrayTemp));

		int max = arrayTemp[0];

		for (int i = 1; i < arrayTemp.length; i++) {
			max = Math.max(max, arrayTemp[i]);
		}

		System.out.println("Max = " + max);

	}

}
