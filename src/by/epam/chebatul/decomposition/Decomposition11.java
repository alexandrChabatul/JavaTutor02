package by.epam.chebatul.decomposition;

import java.util.Random;

/*
 Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Decomposition11 {

	public static void main(String[] args) {

		int numOfTest = 5;
		test(numOfTest);

	}

	public static int findMoreNumbers(int a, int b) {
		String stA = Integer.toString(Math.abs(a));
		String stB = Integer.toString(Math.abs(b));

		if (stA.length() > stB.length()) {
			return a;
		} else if (stB.length() > stA.length()) {
			return b;
		} else {
			return 0;
		}
	}

	public static void test(int numOfTest) {
		Random rand = new Random();

		while (numOfTest != 0) {
			int num1 = rand.nextInt(Integer.MAX_VALUE) - Integer.MAX_VALUE / 2;
			int num2 = rand.nextInt(Integer.MAX_VALUE) - Integer.MAX_VALUE / 2;
			int result = findMoreNumbers(num1, num2);
			if (result == 0) {
				System.out.println("Среди чисел " + num1 + " и " + num2 + " одинаковое количество знаков.");
			} else {
				System.out.println("Среди чисел " + num1 + " и " + num2 + " больше знаков " + result);
			}
			numOfTest--;
		}
	}

}
