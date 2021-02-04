package by.epam.chebatul.array;

/*
 Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class Array06 {

	public static void main(String[] args) {

		double[] array = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int counter = 0;
		double sum = 0;

		for (int i = 1; i <= array.length; i++) {

			for (int a = (int) Math.sqrt(i); a > 1; a--) {

				if (i % a == 0) {
					counter += 1;
					break;
				}
			}
			if (counter == 0) {
				sum += array[i - 1];
			}
			counter = 0;

		}
		System.out.println(sum);

	}

}