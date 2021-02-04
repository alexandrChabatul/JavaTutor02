package by.epam.chebatul.array;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Array03 {

	public static void main(String[] args) {

		int[] arrayNum = { 1, 2, 0, -1, -5, -2, 2, 1, 0, -3 };

		int neg = 0;
		int pos = 0;
		int zero = 0;

		for (int i : arrayNum) {
			if (i > 0) {
				pos += 1;
			} else if (i < 0) {
				neg += 1;
			} else {
				zero += 1;
			}
		}

		System.out.println("Positive - " + pos + "\nNegative - " + neg + "\nZero - " + zero);

	}

}