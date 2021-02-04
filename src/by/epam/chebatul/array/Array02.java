package by.epam.chebatul.array;

/*
 Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */

public class Array02 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 8, 0 };
		int z = 6;
		int counter = 0;

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] > z) {
				arrayA[i] = z;
				counter += 1;
			}
		}
		
		arrayPrint(arrayA);
		System.out.println("\nКоличество замен = " + counter);

	}
	
	public static void arrayPrint(int[] arr) {
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
