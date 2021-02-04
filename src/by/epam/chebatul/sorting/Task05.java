package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
Сортировка вставками. Дана последовательность чисел
n a ,a , ,a 1 2. Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть
a a ai, , , 1 2  - упорядоченная последовательность, т. е.
a1  a2  an. Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task05 {

	public static void main(String[] args) {

		int[] arr = { 35, 1, 2, 3, 4, 7, 8, 9, 34, 4, 5, 6, 7, 3, 1 };
		System.out.println(Arrays.toString(arr));
		sortInsertion(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void sortInsertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (value < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = value;
		}
	}

}
