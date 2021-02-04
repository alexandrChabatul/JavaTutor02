package by.epam.chebatul.sorting;

import java.util.Arrays;

/*
 * Даны дроби (натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания
 */

public class Task08 {

	public static void main(String[] args) {

		int[] n = { 1, 5, 8, 2, 1, 9 };
		int[] m = { 5, 12, 7, 9, 2, 14 };

		commonDen(n, m);
		Arrays.sort(n);
		printFraction(n, m);

	}

	public static void commonDen(int[] n, int[] m) {
		for (int i = 1; i < m.length; i++) {
			if (m[i] % m[i - 1] == 0) {
				for (int j = 0; j < i; j++) {
					n[j] *= (m[i] / m[i - 1]);
					m[j] *= (m[i] / m[i - 1]);
				}
			} else if (m[i - 1] % m[i] == 0) {
				n[i] *= (m[i - 1] / m[i]);
				m[i] *= (m[i - 1] / m[i]);
			} else {
				int temp = m[i - 1] * m[i];
				n[i] *= m[i - 1];
				for (int j = 0; j < i; j++) {
					m[j] = temp;
					n[j] *= m[i];
				}
				m[i] = temp;
			}
		}
	}

	public static void printFraction(int[] n, int[] m) {
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + "/" + m[i] + "\t");
		}
	}

}
