package by.epam.chebatul.decomposition;

/*
 Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Decomposition16 {

	public static void main(String[] args) {

		int n = 3; // N-Значное число.
		int sum;
		sum = findSum(n);
		System.out.println("Сумма n - значных чисел, содержащих только нечетные цифры = " + sum);
		System.out.println("Четных чисел - " + countOddNum(sum));

	}

	public static int findSum(int n) {
		int sum = 0;
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			boolean result = testAllNumOdd(i);
			if (result) {
				sum += i;
			}
		}
		return sum;
	}

	public static int[] numToArray(int num) {
		String numToString = Integer.toString(num);
		int[] tempNum = new int[numToString.length()];
		for (int j = tempNum.length - 1; j >= 0; j--) {
			tempNum[j] = num % 10;
			num /= 10;
		}
		return tempNum;
	}

	public static boolean testAllNumOdd(int num) {
		int[] arr = numToArray(num);
		boolean result;
		result = false;
		for (int i : arr) {
			if (i % 2 != 0) {
				result = true;
			} else {
				return false;
			}
		}
		return result;
	}

	public static int countOddNum(int num) {
		int[] arr = numToArray(num);
		int count = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}