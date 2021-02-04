package by.epam.chebatul.array;

import java.util.Arrays;
import java.util.Random;

/*
 В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */

public class Array09 {

	public static void main(String[] args) {

		int n;
		n = 10;

		int[] arr = new int[n];

		test(5, arr);

	}

	public static void initArray(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}

	}

	public static int getPopularNumber(int[] mas) {

		int[] count = new int[mas.length];

		int counter;

		for (int i = 0; i < mas.length; i++) {
			counter = 0;
			for (int j = 0; j < mas.length; j++) {
				if (mas[i] == mas[j]) {
					counter += 1;
				}
			}
			count[i] = counter;
		}

		int value;
		int result;
		value = count[0];
		result = mas[0];

		for (int i = 1; i < count.length; i++) {

			if (count[i] > value) {
				value = count[i];
				result = mas[i];
			} else if (count[i] == value && mas[i] < result) {
				result = mas[i];
			}

		}
		return result;

	}

	public static void test(int numberOftest, int[] arr) {

		int test = 1;
		while (test <= 5) {	
			System.out.println("Number of test - " + test);
			initArray(arr);
			System.out.println(Arrays.toString(arr));

			int result;
			result = getPopularNumber(arr);
			System.out.println("Result = " + result);
			System.out.println();
			
			test += 1;
			
		}

	}

}