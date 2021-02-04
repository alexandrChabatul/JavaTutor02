package by.epam.chebatul.decomposition;

import java.util.Arrays;
import java.util.Random;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
 */

public class Decomposition10 {

	public static void main(String[] args) {

		int numOfTest = 5;
		test(numOfTest);

	}

	public static int[] numToArrayOfLit(int num) {
		String tempNum = Integer.toString(Math.abs(num));

		int[] numArray = new int[tempNum.length()];

		for (int i = numArray.length - 1; i >= 0; i--) {
			numArray[i] = num % 10;
			num /= 10;
		}

		return numArray;
	}

	public static void test(int numOfTest) {

		Random rand = new Random();

		while (numOfTest != 0) {
			int num = rand.nextInt(Integer.MAX_VALUE);
			int[] numArray = numToArrayOfLit(num);
			System.out.println(num + " - " + Arrays.toString(numArray));
			numOfTest--;
		}
	}

}
