package by.epam.chebatul.decomposition;

/*
 Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Decomposition15 {

	public static void main(String[] args) {
		
		int n = 4; 
		strictlyIncreasing(n);
		
	}

	public static void strictlyIncreasing(int n) {
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			int[] arr = numToArray(i);
			boolean result = chechToSequence(arr);
			if (result) {
				System.out.print(i + "  ");
			}
		}
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

	public static boolean chechToSequence(int[] arr) {
		boolean result;
		result = false;
		int step;
		step = arr[1] - arr[0];
		if (step <= 0) {
			return false;
		}

		int tempStep;
		for (int i = 1; i < arr.length; i++) {
			tempStep = arr[i] - arr[i - 1];
			if (tempStep == step) {
				result = true;
			} else {
				return false;
			}
		}
		return result;
	}

}
