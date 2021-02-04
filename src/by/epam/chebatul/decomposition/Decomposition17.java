package by.epam.chebatul.decomposition;

import java.util.Random;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Decomposition17 {

	public static void main(String[] args) {

		int numOfTest = 5;
		test(numOfTest);

	}

	public static int takeAvaySumOfDigit(int num) {

		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int i = temp % 10;
			sum += i;
			temp /= 10;
		}
		return num - sum;
	}

	public static int takeAvaySumOfDigitToZero(int num) {
		int counter = 0;
		while (num != 0) {
			num = takeAvaySumOfDigit(num);
			counter++;
		}
		return counter;
	}

	public static void test(int numOfTeSt) {
		int testNum = 1;
		while (testNum != numOfTeSt) {
			Random rand = new Random();
			int num;
			num = rand.nextInt(100);
			System.out.println(num + " - " + takeAvaySumOfDigitToZero(num));
			testNum++;
		}

	}

}
