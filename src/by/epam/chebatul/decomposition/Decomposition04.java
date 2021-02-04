package by.epam.chebatul.decomposition;

import java.util.Scanner;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Decomposition04 {

	public static void main(String[] args) {

		int n;
		n = 5; 

		int[] arr = initPoint(n);
		findMaxDistance(arr);

	}

	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		int num = sc.nextInt();
		return num;
	}

	public static int[] initPoint(int n) {
		int[] arr = new int[n * 2];
		for (int i = 0; i < arr.length; i += 2) {
			arr[i] = enterFromConsole("Введите X" + ((i + 1) / 2) + " >> ");
			arr[i + 1] = enterFromConsole("Введите Y" + ((i + 1) / 2) + " >> ");
		}
		return arr;

	}

	public static void findMaxDistance(int[] arr) {

		double max = Math.sqrt(Math.pow(arr[0] - arr[2], 2) + Math.pow(arr[1] - arr[3], 2));
		int indX1 = 0;
		int indX2 = 1;
		double tempMax;

		for (int i = 0; i < arr.length; i += 2) {
			for (int j = 0; j < arr.length; j += 2) {
				tempMax = Math.sqrt(Math.pow(arr[i] - arr[j], 2) + Math.pow(arr[i + 1] - arr[j + 1], 2));
				if (tempMax > max) {
					max = tempMax;
					indX1 = i;
					indX2 = j;
				}
			}
		}
		System.out.println("Первая точка x" + indX1 + "y" + indX1 + "(" + arr[indX1] + ";"
				+ arr[indX1 + 1] + ")" + " Вторая точка x" + indX2 + "y" + indX2 + " (" + arr[indX2] + ";" + arr[indX2 + 1] + ")"
				+ " Расстояние " + max + ".");
	}

}
