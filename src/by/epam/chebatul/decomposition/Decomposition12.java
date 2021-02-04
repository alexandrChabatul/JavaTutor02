package by.epam.chebatul.decomposition;

import java.util.ArrayList;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Decomposition12 {

	public static void main(String[] args) {

		int k = 16;
		int n = 1000;
		ArrayList<Integer> a = mainLogic(k, n);
		System.out.println(a);

	}

	public static int sumOfDigit(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static ArrayList<Integer> mainLogic(int k, int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			int sum;
			sum = sumOfDigit(i);
			if (sum == k) {
				arr.add(i);
			}
		}
		return arr;
	}

}
