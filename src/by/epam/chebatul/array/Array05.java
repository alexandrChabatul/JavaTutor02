package by.epam.chebatul.array;

/*
 *  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
 */

public class Array05 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 1, 2, 3, 5, 6, 7, 8, 12, 13, 14, 5 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
