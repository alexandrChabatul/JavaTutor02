package by.epam.chebatul.decomposition;

import java.util.Random;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Decomposition06 {

	public static void main(String[] args) {

		test(5);

	}

	public static int findNOD(int a, int b) {

		int nod = 0;

		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int tempBalance;

		tempBalance = max % min;
		do {
			if (tempBalance == 0) {
				nod = min;

			} else {
				max = min;
				min = tempBalance;
				tempBalance = max % min;
				nod = min;
			}
		} while (tempBalance != 0);

		return nod;

	}

	public static int findDen(int num1, int num2, int num3) {
		if (num1 == 0 || num2 == 0 || num3 == 0 || num3 == 0) {
			return 0;
		}

		int[] numArr = new int[3];
		numArr[0] = num1;
		numArr[1] = num2;
		numArr[2] = num3;

		int tempLength = numArr.length;

		while (numArr[1] != 0) {
			for (int i = 1; i < tempLength; i++) {
				numArr[i - 1] = findNOD(numArr[i - 1], numArr[i]);
			}
			numArr[tempLength - 1] = 0;
			tempLength--;
		}
		return numArr[0];
	}

	public static void test(int numOfTest) {

		Random rand = new Random();

		while (numOfTest != 0) {
			int num1 = rand.nextInt(100);
			int num2 = rand.nextInt(100);
			int num3 = rand.nextInt(100);
			System.out.println(num1 + " " + num2 + " " + num3);
			int result = findDen(num1, num2, num3);
			if (result == 1) {
				System.out.println("True.");
			} else {
				System.out.println("False.");
			}
			numOfTest--;
		}

	}

}
