package by.epam.chebatul.array;

/*
 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */

public class Array01 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 0, 6, 7, 8, 9, 123, 123, 212, 4567 };
		int k = 2;
		int sum = 0;

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % k == 0) {
				sum +=arrayA[i];
			}
		}
		System.out.println("Result = " + sum);

	}

}
