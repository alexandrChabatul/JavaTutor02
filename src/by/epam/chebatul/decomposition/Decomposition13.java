package by.epam.chebatul.decomposition;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
 */

public class Decomposition13 {

	public static void main(String[] args) {

		int n = 50;
		int[] arr = makeArray(n);
		mainLogic(arr);

	}

	public static int[] makeArray(int n) {
		int[] arr = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n;
			n++;
		}
		return arr;
	}

	public static boolean twinTest(int a, int b) {

		if (a - b == 2 || b - a == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void mainLogic(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (twinTest(arr[i], arr[j])) {
					System.out.println(arr[i] + "\t" + arr[j]);
				}
			}
		}
	}

}
