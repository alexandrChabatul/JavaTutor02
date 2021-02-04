package by.epam.chebatul.decomposition;

/*
 Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */

public class Decomposition14 {

	public static void main(String[] args) {

		int k = 1000000;
		findArmstrongNum(k);

	}

	public static int sumOfDigit(int num) {
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static int quantityOfDigit(int num) {
		int quant = 0;
		while (num != 0) {
			quant++;
			num /= 10;
		}
		return quant;
	}

	public static void findArmstrongNum(int max) {
		System.out.print("Числа Армстронга до " + max + " : ");
		for (int i = 1; i < max; i++) {
			int sum = sumOfDigit(i);
			int quant = quantityOfDigit(i);
			if (Math.pow(sum, quant) == i) {
				System.out.print(i + " ");
			}
		}
	}

}
