package by.epam.chebatul.decomposition;

/*
  Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
НОК (А,В) = A*B / НОД (А,В)
 */

public class Decomposition01 {

	public static void main(String[] args) {

		int a = -110;
		int b = 15;

		int nod = findNOD(a, b);
		System.out.println(nod);

		int nok = findNOK(a, b, nod);
		System.out.println(nok);

	}

	public static int findNOD(int a, int b) {

		int nod = 0;

		if (a == 0 || b == 0) {
			return nod;
		}

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

	public static int findNOK(int a, int b, int nod) {

		if (nod == 0) {
			return 0;
		} else {
			return a * b / nod;
		}

	}

}