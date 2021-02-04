package by.epam.chebatul.decomposition;

/*
.Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Decomposition07 {

	public static void main(String[] args) {

		int x = 9; // To this num.

		System.out.println("Result = " + mainLogic(x));

	}

	public static int toFactorial(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static int mainLogic(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i += 2) {
			sum += toFactorial(i);
		}
		return sum;
	}

}
