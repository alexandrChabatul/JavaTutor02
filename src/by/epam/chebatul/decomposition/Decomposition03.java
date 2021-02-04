package by.epam.chebatul.decomposition;

import java.util.Random;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */

public class Decomposition03 {

	public static void main(String[] args) {

		int numTest = 5;
		test(numTest);

	}

	public static double findArea(int a) {
		double area;
		area = 6 * a * a * Math.sqrt(3) / 4;
		return area;
	}

	public static void test(int numOfTest) {
		Random rand = new Random();
		while (numOfTest != 0) {
			int a = rand.nextInt(10) + 1;
			System.out.println("У шестиугольника со стороный " + a + " площадь " + findArea(a));
			numOfTest--;
		}
	}
}
