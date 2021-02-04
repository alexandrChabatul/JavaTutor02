package by.epam.chebatul.array;

import java.util.Arrays;

/*
  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Array04 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 5, 66, 7, 8 };

		int max;
		int min;

		max = arrayA[0];
		min = arrayA[0];

		for (int i : arrayA) {
			max = Math.max(max, i);
			min = Math.min(min, i);
		}

		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] == max) {
				maxIndex = i;
			} else if (arrayA[i] == min) {
				minIndex = i;

			}
		}
	
        // Swap
		int temp;

		temp = arrayA[maxIndex];
		arrayA[maxIndex] = arrayA[minIndex];
		arrayA[minIndex] = temp;
		
		System.out.println(Arrays.toString(arrayA));

	}

}