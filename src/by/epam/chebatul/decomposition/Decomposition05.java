package by.epam.chebatul.decomposition;

import java.util.Arrays;

/*
 Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Decomposition05 {

	public static void main(String[] args) {
		int[] arr = { 8, 8, 1, 2, 3, 4, 5, 6, 7, 10 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Второе число - " + findSecondNum(arr));
	}

	public static int findSecondNum(int[] array) {
		int[] copyOfArray = array.clone();
		Arrays.sort(copyOfArray);

		int max = copyOfArray[0];
		int secondMax = copyOfArray[0];
		for (int i : copyOfArray) {
			if (i > max) {
				secondMax = max;
				max = i;
			}
		}
		return secondMax;
	}

}
