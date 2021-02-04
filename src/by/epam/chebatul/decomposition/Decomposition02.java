package by.epam.chebatul.decomposition;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */
public class Decomposition02 {

	public static void main(String[] args) {

		int a = 12;
		int b = 16;
		int c = 2;
		int d = 28;

		int nod = findDen(a, b, c, d);
		if (nod != 0) {
			System.out.println("Наибольший общий делитель - " + nod);
		} else {
			System.out.println("Нет общих делителей...");
		}

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

	public static int findDen(int num1, int num2, int num3, int num4) {
		if (num1 == 0 || num2 == 0 || num3 == 0 || num3 == 0 || num4 == 0) {
			return 0;
		}

		int[] numArr = new int[4];
		numArr[0] = num1;
		numArr[1] = num2;
		numArr[2] = num3;
		numArr[3] = num4;
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
}
