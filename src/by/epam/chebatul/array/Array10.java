package by.epam.chebatul.array;

import java.util.Arrays;

/*
 Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Array10 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		compression(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] compression(int[] mas) {

		int tempLenth;

		if (mas.length % 2 == 0) {
			tempLenth = mas.length / 2;
		} else {
			tempLenth = mas.length / 2 + 1;
		}

		int counter = 1;

		if (mas.length < 2) {
			return mas;
		} else {
			for (int i = 2; i < mas.length; i += 2) {
				mas[counter] = mas[i];
				counter += 1;
			}
			for (int i = tempLenth; i < mas.length; i++) {
				mas[i] = 0;
			}
			return mas;

		}

	}

}